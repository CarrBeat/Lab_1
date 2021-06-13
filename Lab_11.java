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

                    if (rstr.startsWith("/*")) { // начало  многострочного комментария с начала строки
                        check = true;
                        continue;
                    }

                    if (check & !rstr.contains("*/")) { // пропуск строки, если идет многострочный коммент
                        continue;
                    }

                    if (check & rstr.endsWith("*/")) { //конец многострочного коммента
                        check = false;
                        continue;
                    }


                    if (!rstr.contains("//") & !rstr.contains("*/") & !rstr.contains("*/")) { // не комментарии
                        fw.write(rstr + "\n");
                    } else {
                        ind = rstr.lastIndexOf("//"); // однострочные комментарии
                        if (ind == 0){
                            continue;
                        }
                        if (ind > 0 & ind + 3 != rstr.indexOf(")")) {
                            temp = rstr.substring(0, ind);
                            fw.write(temp + "\n");
                        } else {
                            fw.write(rstr + "\n");
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Комментарии удалены!");
        }
    }