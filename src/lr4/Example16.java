//В программе, где требуется из матрицы вывести столбец с номером, заданным с
//клавиатуры, могут возникать ошибки в следующих случаях:
//– ввод строки вместо числа;
//– нет столбца с таким номером.

package lr4;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Example16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        int[][] matrix = new int[5][5];
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                matrix[i][j] = rnd.nextInt(100);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Введите номер столбца: ");
        try {
            int number = in.nextInt();
            for (int i = 0; i < matrix.length; i++)
                System.out.println(matrix[i][number]);
        }
        catch (InputMismatchException e)
        {
            System.out.println("Ввод строки вместо числа 1 " + e); //asd
            System.exit(1);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Нет столбца с таким номером 2 " + e);
        }
    }
}
