package lr1;

//Напишите программу для вычисления суммы двух чисел. Оба числа
//вводятся пользователем. Для вычисления суммы используйте оператор +.

import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите 1 число: "); float a = in.nextFloat();
        System.out.print("Введите 2 число: "); float b = in.nextFloat();
        System.out.printf("Сумма чисел = %.2f", a+b);
        in.close();
    }
}
