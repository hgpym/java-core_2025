//Заполнить HashMap 10 объектами <Integer, String>. Найти строки
//у которых ключ > 5 Если ключ = 0, вывести строки через запятую.
//Перемножить все ключи, где длина строки>5.

package lr3;

import java.util.HashMap;
import java.util.Map;

public class Example9 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(0, "ноль");
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "четыре");
        map.put(5, "пять");
        map.put(6, "шесть");
        map.put(7, "семь");
        map.put(8, "восемь");
        map.put(9, "девять");

        System.out.println("Строки с ключом > 5:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getKey() > 5) {
                System.out.println(entry.getValue());
            }
        }

        if (map.containsKey(0)) {
            System.out.print("Строки если ключ = 0: ");
            for (Map.Entry<Integer, String> entry : map.entrySet()) {
                if (entry.getKey() == 9)
                    System.out.println(entry.getValue());
                else
                    System.out.print(entry.getValue() + ", ");
            }
        }

        int product = 1;
        boolean hasLongStrings = false;
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getValue().length() > 5) {
                product *= entry.getKey();
                hasLongStrings = true;
            }
        }

        if (hasLongStrings) {
            System.out.println("Произведение ключей, где длина строки > 5: " + product);
        } else {
            System.out.println("Нет строк длиной больше 5 символов.");
        }
    }
}
