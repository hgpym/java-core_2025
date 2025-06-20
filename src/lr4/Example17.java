//В программе, вычисляющей сумму элементов типа byte одномерного массива,
//вводимого с клавиатуры, могут возникать ошибки в следующих случаях:
//– ввод строки вместо числа;
//– ввод или вычисление значения за границами диапазона типа.

package lr4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        byte[] array = new byte[5];
        long t = 0;
        try {
            for (int i = 0; i < array.length; i++)
            {
                array[i] = in.nextByte();
                t += array[i];
            }
        }
        catch (NumberFormatException e)
        {
            System.out.println("Ввод строки вместо числа 1 " + e); //asd
            System.exit(1);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Ввод или вычисление значения за границами диапазона типа 2 " + e);
            System.exit(2);
        }
        System.out.println(t);
    }
}
