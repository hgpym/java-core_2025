//В программе, вычисляющей среднее значение среди положительных элементов
//одномерного массива (тип элементов int), вводимого с клавиатуры, могут
//возникать ошибки в следующих случаях:
//– ввод строки вместо числа;
//– несоответствие числового типа данных;
//– положительные элементы отсутствуют.

package lr4;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array = new int[5];
        int sum = 0;
        System.out.println("Введите число: ");
        for (int i = 0; i < array.length; i++)
        {
            try {
                double temp = in.nextDouble();
                if (temp < 0)
                {
                    throw new IllegalArgumentException();
                }
                if (temp % 1 != 0)
                {
                    throw new ArrayStoreException();
                }
                array[i] = (int)temp;
                sum += array[i];
            }
            catch (InputMismatchException e)
            {
                System.out.println("Ввод строки вместо числа 1 " + e); //asd
                System.exit(1);
            }
            catch (ArrayStoreException e)
            {
                System.out.println("Ввод неправильного типа данных 2 " + e); //123,123
                System.exit(2);
            }
            catch (IllegalArgumentException e) {
                System.out.println("Ввод отрицательного числа 3 " + e); //-6
                System.exit(3);
            }
        }
        System.out.println("Среднее значение = " + (sum / array.length));
    }
}
