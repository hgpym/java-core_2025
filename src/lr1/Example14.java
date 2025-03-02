package lr1;

//Напишите программу, в которой пользователь вводит число, а программой
//отображается последовательность из четырех чисел: число, на единицу
//меньше введённого, введенное число и число, на единицу больше
//введенного. Четвертое число должно быть квадратом суммы первых трех
//чисел.

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: "); float number = in.nextFloat();
        System.out.printf("%.2f, %.2f, %.2f, %.2f", number-1, number, number+1, number*3*number*3);
        in.close();
    }
}
