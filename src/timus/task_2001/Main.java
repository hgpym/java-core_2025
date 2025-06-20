package timus.task_2001;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();
        int a3 = sc.nextInt();
        int b3 = sc.nextInt();
        sc.close();

        int x = a1 - a3;
        int y = b1 - b2;

        System.out.println(x + " " + y);
    }
}
