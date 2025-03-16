package timus.task_2012;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int f = in.nextInt();
        in.close();

        int remainingTasks = 12 - f;
        int remainingTime = 4 * 60;
        if (remainingTasks * 45 <= remainingTime) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
