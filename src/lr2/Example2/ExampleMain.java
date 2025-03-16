package lr2.Example2;

import java.util.Scanner;

public class ExampleMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int shtStr = 1;
        String encryptStr = Encrypt.getEncryptString(in.nextLine(), shtStr);
        System.out.println(encryptStr);
        in.close();
    }
}


