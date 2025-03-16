package lr2.Example2;

public class Encrypt {
    public static String getEncryptString(String encryptString, int shift) {
        char[] arrayChar = encryptString.toCharArray();
        long[] arrayInt = new long[arrayChar.length];
        char[] arrayCharNew = new char[arrayChar.length];
        for (int i = 0; i < arrayChar.length; i++)
        {
            arrayInt[i] = arrayChar[i] + shift;
            arrayCharNew[i] = (char)arrayInt[i];
        }
        encryptString = new String(arrayCharNew);

        return encryptString;
    }

    public static String getDecryptString(String decryptString, int shift) {
        char[] arrayChar = decryptString.toCharArray();
        long[] arrayInt = new long[arrayChar.length];
        char[] arrayCharNew = new char[arrayChar.length];

        for (int i = 0; i < arrayChar.length; i++) {
            arrayInt[i] = arrayChar[i] - shift;  // Обратный сдвиг
            arrayCharNew[i] = (char) arrayInt[i];
        }

        return new String(arrayCharNew);
    }
}
