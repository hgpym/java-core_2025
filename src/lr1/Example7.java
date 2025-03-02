package lr1;

//Напишите программу, в которой Пользователь вводит имя и возраст.
//Программа отображает сообщение об имени и возрасте пользователя.

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя: "); String name = in.nextLine();
        System.out.print("Введите возраст: "); int age = in.nextInt();
        System.out.printf("Имя: %s\nВозраст: %d", name, age);
        in.close();
    }
}
