//Создать приложение, позволяющее ввести и вывести одномерный
//массив целых чисел. Для ввода и вывода массива разработать рекурсивные
//методы вместо циклов for.

package lr3;

import java.util.ArrayList;
import java.util.Scanner;

public class Example7 {
    private static int n = 0;
    private static int size;
    private static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите размер массива: ");
        size = in.nextInt();

        enter_array(in);
        n = 0;
        print_array();
        in.close();
    }

    public static void enter_array(Scanner in) {
        if (n == size) {
            return;
        } else {
            System.out.printf("Введите элемент %d: ", n);
            list.add(in.nextInt());
            n++;
            enter_array(in);
        }
    }

    public static void print_array() {
        if (n == size) {
            return;
        }
        System.out.printf("Элемент с индексом %d = %d\n", n, list.get(n));
        n++;
        print_array();
    }
}
