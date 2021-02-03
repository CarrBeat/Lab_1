import java.util.Scanner;
public class Lab_1 {
public static void main(String[]args) {
	
Scanner in = new Scanner(System.in);

System.out.print("Input a: ");

int a = in.nextInt();

double numerator = Math.sin(2 * a) + Math.sin(5 * a) - Math.sin(3 * a);
double denumerator = Math.cos(a) + 1 - 2 * (Math.sin(2 * a) * Math.sin(2 * a));
double z = numerator / denumerator;
	System.out.printf("z = %f", z);
}
}
