//Создайте приложение, которое будет запрашивать у пользователя
//название файла и выводить на экран его размер в байтах.

package lr7;

import java.io.File;
import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите путь к файлу: ");
        String filePath = in.nextLine();

        File file = new File("src/lr7/" + filePath);

        if (file.exists() && file.isFile()) {
            long fileSizeInBytes = file.length();
            System.out.println("Размер файла в байтах: " + fileSizeInBytes + " байт");
        } else {
            System.out.println("Файл не найден или указан неверный путь.\n" + file.getPath());
        }

        in.close();
    }
}
