package lr1;

//Напишите программу, в которой Пользователь вводит два числа, а
//программой вычисляется и отображается сумма и разность этих чисел.

import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите 1 число: "); float a = in.nextFloat();
        System.out.print("Введите 2 число: "); float b = in.nextFloat();
        System.out.printf("Сумма чисел = %.2f\nРазность чисел = %.2f", a+b, a-b);
        in.close();

    }
}
