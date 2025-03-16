//Напишите программу, в которой создается двумерный
//числовой массив и этот массив заполняется «змейкой»: сначала первая
//строка (слева направо), затем последний столбец (сверху вниз), вторая
//строка (справа налево) и так далее, как показано на рисунке:
/*  -----→
         ↓
    ←-----
    ↓
    -----→    */

package lr2;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размерность массива(NxM)");
        int N = in.nextInt(), M = in.nextInt();
        int[][] mass = new int[N][M];
        boolean isRightToLeft = false;
        int value = 0;
        for (int i = 0; i < mass.length; i++)
        {
            if (!isRightToLeft) {
                for (int j = 0; j < mass[i].length; j++) {
                    mass[i][j] = value;
                    value++;
                }
                isRightToLeft = true;
            }
            else {
                for (int j = mass[i].length - 1; j >= 0; j--) {
                    mass[i][j] = value;
                    value++;
                }
                isRightToLeft = false;
            }
        }
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                System.out.print("mass["+i+"]["+j+"]:"+mass[i][j]+"   ");
            }
            System.out.println();
        }
        in.close();
    }
}
