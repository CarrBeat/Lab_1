import java.math.BigInteger;
import java.util.Scanner;
public class Lab_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array the first positive number: ");
        int start = input.nextInt();

        System.out.println("Enter array the final positive number (final > first): ");
        int finish = input.nextInt();

        System.out.println("Enter M number (M > first num)");
        int m = input.nextInt();
        while (m <= start) {
            System.out.println("Invalid number, enter m number again (M > first num):");
            m = input.nextInt();
        }

        if (m >= finish) {
            System.out.println("The array does not contain numbers greater than M");

        } else {

            int[] nums;
            nums = new int[finish - start + 1];
            int num = start;
            for (int i = 0; i < finish - start + 1; i++) { // цикл заполнения массива
                nums[i] = num;
                num++;
            }

            BigInteger prod = BigInteger.valueOf(1);
            for (int j = 0; j < finish - start + 1; j++) {  // произведение
                if (nums[j] > m) {
                    prod = prod.multiply(BigInteger.valueOf(nums[j]));
                }
            }
            System.out.println(prod);

        }
    }
}
