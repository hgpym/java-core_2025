package timus.task_1877;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int keyOne = in.nextInt();
        int keyTwo = in.nextInt();
        int tempKey = 0;
        boolean isKey = false;
        in.close();

        for(int i = 1; i <= Math.max(keyOne,keyTwo); i++)
        {
            if (i % 2 == 0)
                tempKey = keyOne;
            else
                tempKey = keyTwo;

            if (tempKey == i) {
                System.out.println("yes");
                isKey = true;
                break;
            }
        }
        if (!isKey)
            System.out.println("no");
    }
}
