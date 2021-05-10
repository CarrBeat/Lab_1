import java.util.Scanner;
public class Lab_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите IPv4 адрес: ");
        String str = input.nextLine();
        boolean check = str.matches("((\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5])\\.){3}(\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5])");
        if(check){
            System.out.println("IP-адрес верный!");
        }
        else{
            System.out.println("IP-адрес неверный!");
        }
    }
}
