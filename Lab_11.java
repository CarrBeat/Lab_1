import java.io.*;
public class Lab_11 {
        public static void main(String[] args) throws FileNotFoundException {
            try (BufferedReader br = new BufferedReader(new FileReader("Lab_11.txt"));
                 FileWriter fw = new FileWriter("Lab_11e.txt")) {
                String rstr;
                String temp;
                boolean check = false;
                int ind;
                while ((rstr = br.readLine()) != null) {
                    if (rstr.contains(" ")) { // удаление пробелов в начале строки
                        rstr = rstr.trim();
                    }
                    if (rstr.startsWith("/*")) { // начало  многострочного комментария
                        check = true;
                        continue;
                    }
                    if (check & !rstr.contains("*/")) {
                        continue;
                    }
                    if (check & rstr.contains("*/")) {
                        check = false;
                        if (rstr.endsWith("*/")) {
                            continue;
                        }
                        temp = rstr.substring(rstr.indexOf("*/") + 2);
                        fw.write(temp + "\n");
                        continue;
                    }

                    if (!rstr.contains("//") & !rstr.contains("*/") & !rstr.contains("*/")) {
                        fw.write(rstr + "\n");
                    }

                    ind = rstr.lastIndexOf("//");
                    if (ind > 0) {
                        temp = rstr.substring(0, ind);
                        fw.write(temp + "\n");
                    }
                    if (ind == 0) {
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Комментарии удалены!");
        }
    }