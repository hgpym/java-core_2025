package lr1;

//Напишите программу, в которой по возрасту определяется год рождения.

import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        final int YEAR = 2025;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите ваш возраст: "); int age = in.nextInt();
        System.out.printf("Год рождения: %d", YEAR-age);
        in.close();
    }
}
