package timus.task_1785;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        in.close();
        String anindilyakwa;

        if (number >= 1 && number <= 4) {
            anindilyakwa = "few";
        } else if (number >= 5 && number <= 9) {
            anindilyakwa = "several";
        } else if (number >= 10 && number <= 19) {
            anindilyakwa = "pack";
        } else if (number >= 20 && number <= 49) {
            anindilyakwa = "lots";
        } else if (number >= 50 && number <= 99) {
            anindilyakwa = "horde";
        } else if (number >= 100 && number <= 249) {
            anindilyakwa = "throng";
        } else if (number >= 250 && number <= 499) {
            anindilyakwa = "swarm";
        } else if (number >= 500 && number <= 999) {
            anindilyakwa = "zounds";
        } else if (number >= 1000) {
            anindilyakwa = "legion";
        } else {
            anindilyakwa = "Out of range";
        }

        System.out.println(anindilyakwa);
    }
}
