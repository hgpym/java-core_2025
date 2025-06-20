//Исключение IllegalArgumentException – неверные аргументы.

package lr4;

public class Example12 {
    public static void m(String str, double chislo) {
        if (str == null) {
            throw new IllegalArgumentException("Строка введена неверно");
        }
        if (chislo > 0.001) {
            throw new IllegalArgumentException("Неверное число");
        }
    }

//    public static void main(String[] args) {
//        m(null, 0.000001);
//    }

    public static void main(String[] args) {
        try {
            m(null, 0.000001);
            throw new IllegalArgumentException();
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("1 " + e);
        }

    }
}
