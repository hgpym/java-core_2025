//Напишите программу «Шифр Цезаря», которая зашифровывает
//введенный текст. Используете кодовую таблицу символов. При запуске
//программы в консоль необходимо вывести сообщение: «Введите текст для
//шифрования», после ввода текста, появляется сообщение: «Введите ключ».
//После того как введены все данные, необходимо вывести преобразованную
//строку с сообщением «Текст после преобразования: ». Далее необходимо
//задать вопрос пользователю: «Выполнить обратное преобразование? (y/n)»,
//если пользователь вводит «y», тогда выполнить обратное преобразование.
//Если пользователь вводит «n», того программа выводит сообщение «До
//свидания!». Если пользователь вводит что-то другое, отличное от «y» или
//«n», то программа ему выводит сообщение: «Введите корректный ответ».

package lr2;

import lr2.Example2.Encrypt;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст для шифрования");
        String encryptStr = in.nextLine();
        System.out.println("Введите ключ");
        int shtStr = in.nextInt();
        encryptStr = Encrypt.getEncryptString(encryptStr, shtStr);
        System.out.println("Текст после преобразования:" + encryptStr);
        System.out.println("Выполнить обратное преобразование? (y/n)");
        for(;;) {
            char choose = in.next().charAt(0);
            if (choose == 'y') {
                encryptStr = Encrypt.getDecryptString(encryptStr, shtStr);
                System.out.println("Текст после преобразования:" + encryptStr);
                break;
            } else if (choose == 'n') {
                System.out.println("До свидания!");
                break;
            } else {
                System.out.println("Введите корректный ответ");
            }
        }
        in.close();
    }
}
