import java.util.Random;
import java.util.Scanner;
public class Lab_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размерность матрицы: ");
        int size = in.nextInt();

        System.out.print("Введите номер строки, на которую нужно заменить строку с макс знач по гл. диаг. (m): ");
        int m = in.nextInt() - 1;

        while (m + 1 > size){
            System.out.println("Введите число m заново (m < размера матрицы)");
            m = in.nextInt() - 1;
        }

        int[][] matrix = new int[size][size];
        for (int i = 0; i < matrix.length; i++) {        // заполнение матрицы случайными числами
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = RandomInt(10, 99);
            }
        }

        System.out.println("Исходная матрица:");

        for (int i = 0; i < matrix.length; i++) {       // вывод матрицы
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.println();
        }

        int[] diag;
        int maxValue = 0;
        int maxValid = 0;
        diag = new int[size];

        for (int i = 0; i < matrix.length; i++) { // нахождение макс. знач. диагонали, а также номера строки/столбца
            diag[i] = matrix[i][i];
            if (diag[i] > maxValue) {
                maxValue = diag[i];
                maxValid = i;
            }
        }

        int[] tmp = new int[size];
        int[] tmp2 = new int[size];

        if (maxValid != m) {
        for (int i = 0; i < size; i++){         // цикл замены строк
            tmp[i] = matrix[maxValid][i];
            tmp2[i] = matrix[m][i];
            matrix[m][i] = tmp[i];
            matrix[maxValid][i] = tmp2[i];
        }
        System.out.println("Измененная матрица:");
        for (int i = 0; i < matrix.length; i++) {       // вывод массива
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.println();
        }
        } else {
            System.out.println("Строка m совпадает со строкой, имеющей макс. значение по гл. диаг. ");
        }
    }

    public static int RandomInt(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }

}
