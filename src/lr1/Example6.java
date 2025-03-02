package lr1;

//Напишите программу, в которой Пользователь вводит сначала фамилию,
//затем имя, затем отчество. После ввода программа выводит сообщение
//«Hello <фамилия, имя, отчество>».

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите фамилию: "); String f = in.nextLine();
        System.out.print("Введите имя: "); String n = in.nextLine();
        System.out.print("Введите отчество: "); String o = in.nextLine();
        System.out.printf("Hello %s %s %s", f, n, o);
        in.close();
    }
}