package lr1;

//Напишите программу, в которой Пользователь последовательно вводит
//название текущего дня недели, название месяца и дату (номер дня в месяце).
//Программа выводит сообщение о сегодняшней дате (день недели, дата,
//месяц).

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите название текущего дня недели: "); String dayWeek = in.nextLine();
        System.out.print("Введите название месяца: "); String month = in.nextLine();
        System.out.print("Введите номер дня в месяце: "); int day = in.nextInt();
        System.out.printf("Сегодня %s, %d число, %s месяц", dayWeek, day, month);
        in.close();
    }
}
