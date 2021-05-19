import java.util.Scanner;
import java.io.*;
public class lab_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String mess;
        System.out.println("Введите IPv4-адрес: ");
        String input = in.nextLine();
        boolean check = input.matches("((\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5])\\.){3}(\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5])");
        if(check) {
            mess = "IP-адрес верный!";
            System.out.println(mess);
        }
        else{
            mess = "IP-адрес неверный!";
            System.out.println(mess);
        }
        System.out.println("Введите ud, чтобы увидеть данные пользователя");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("lab_12.txt"))){
            bw.write(input + "\n");
            bw.write(mess);
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        String inf = in.nextLine();
        if (inf.equals("ud")){
            try(BufferedReader br = new BufferedReader(new FileReader("lab_12.txt"))){
                String take;
                while ((take = br.readLine())!= null){
                    System.out.println(take);
                }}
            catch (IOException ex){
                System.out.println(ex.getMessage());
            }}}}
