import java.util.Scanner;
public class Lab_3 {
    public static void main(String[]args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a: ");
        int n = in.nextInt();

        if (n > 0) {
            int i = 2, j = 3;
            double p = 1;

            while (i <= 2 * n & j <= 2 * n + 1) {
                p = p * i / j;
                System.out.println(i);
                System.out.println(j);
                i = i + 2;
                j = j + 2;
                System.out.println("P = " + p);
            }
        }
        else {
            System.out.println("Неверное значение N!");
        }
    }
}