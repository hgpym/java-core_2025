package timus.task_1001;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Long> A = new ArrayList<>();
        while (in.hasNextLong()) {
            A.add(in.nextLong());
        }
        for (int i = A.size() - 1; i >= 0; i--)
        {
            System.out.printf("%.4f\n", (double)Math.sqrt(A.get(i)));
        }
    }
}
