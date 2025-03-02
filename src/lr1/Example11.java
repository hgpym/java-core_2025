package lr1;

//Напишите программу, в которой Пользователь вводит имя и год рождения,
//в программа отображает сообщение содержащее имя пользователя и его
//возраст.

import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        final int YEAR = 2025;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя: "); String name = in.nextLine();
        System.out.print("Введите год рождения: "); int ageYear = in.nextInt();
        System.out.printf("Имя: %s\nВозраст: %d", name, YEAR-ageYear);
        in.close();
    }
}
