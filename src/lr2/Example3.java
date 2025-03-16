//Напишите программу, в которой создается массив и
//заполняется случайными числами. Массив отображается в консольном
//окне. В этом массиве необходимо определить элемент с минимальным
//значением. В частности, программа должна вывести значение элемента
//с минимальным значением и индекс этого элемента. Если элементов с
//минимальным значением несколько, должны быть выведены индексы
//всех этих элементов.

package lr2;

import java.util.*;

public class Example3 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = id.nextInt();
        System.out.println("Размер массива равен " + size);
        int[] nums = new int[size];
        Random random = new Random();
        for(int i = 0; i < nums.length; i++)
        {
            nums[i] = random.nextInt(5);
            System.out.println("Элемент массива ["+i+"] = " + nums[i]);
        }
        Arrays.sort(nums);
        System.out.println("Произведена сортировка массива");
        for(int i = 0; i < nums.length; i++)
        {
            System.out.println("Элемент массива ["+i+"] после сортировки = " + nums[i]);
        }
        int min = Arrays.stream(nums).min().orElseThrow();
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] == min)
            {
                System.out.printf("index: %d, minValue: %d\n", i, nums[i]);
            }
            else
            {
                break;
            }
        }
        id.close();
    }
}
