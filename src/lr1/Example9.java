package lr1;

//Напишите программу, в которой пользователю предлагается ввести
//название месяца и количество дней в этом месяце. Программа выводит
//сообщение о том, что соответствующий месяц содержит указанное
//количество дней.

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите название месяца: "); String month = in.nextLine();
        System.out.print("Введите количество дней в этом месяце: "); int quant = in.nextInt();
        System.out.printf("%s имеет %d дней", month, quant);
        in.close();
    }
}
