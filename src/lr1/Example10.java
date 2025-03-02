package lr1;

//Напишите программу, в которой по году рождения определяется возраст
//пользователя.

import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        final int YEAR = 2025;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите год рождения: "); int ageYear = in.nextInt();
        System.out.printf("Ваш возраст: %d",  YEAR-ageYear);
        in.close();
    }
}
