package timus.task_1293;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N, A, B;
        while (true)
        {
            N = in.nextInt(); A = in.nextInt(); B = in.nextInt();
            if (N >= 1 && N <= 100 && A >= 1 && A <= 100 && B >= 1 && B <= 100) {
                break;
            }
        }
        System.out.println(N*A*B*2);
        in.close();
    }
}