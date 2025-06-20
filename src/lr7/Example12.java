//Создайте приложение, которое будет запрашивать у пользователя
//название файла и текст, который нужно записать в этот файл. После
//записи текста в файл программа должна выводить на экран количество
//записанных символов.

package lr7;

import java.io.*;
import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите имя файла для записи: ");
        String fileName = in.nextLine();

        System.out.print("Введите текст, который хотите записать в файл: ");
        String textToWrite = in.nextLine();

        File file = new File("src/lr7/" + fileName);

        try (PrintWriter printWriter = new PrintWriter(file, "UTF-8")) {
            printWriter.println(textToWrite);
            System.out.println("Данные записаны в файл: " + file);
            System.out.println("Количество записанных символов: " + textToWrite.length());
        } catch (IOException e) {
            System.out.println("Ошибка при чтении/записи файла: " + e.getMessage());
        }

        in.close();
    }
}
