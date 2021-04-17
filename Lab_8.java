import java.util.Scanner;
public class Lab_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str1;
        str1 = input.nextLine();
        while (str1.isEmpty()) {
            System.out.println("Введите строку: ");
            str1 = input.nextLine();
        }
        System.out.println("Введите подстроку для проверки: ");
        String str2;
        str2 = input.nextLine();
        while (str2.isEmpty()) {
            System.out.println("Введите строку: ");
            str2 = input.nextLine();
        }
        boolean check = str1.endsWith(str2);
        if (check) {
            System.out.println("Строка заканчивается подстрокой");
        } else {
            System.out.println("Строка не заканчивается подстрокой");
        }
    }
}
