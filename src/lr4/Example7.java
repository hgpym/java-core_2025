//Нельзя перехватить брошенное исключение с помо-щью
//чужого catch, даже если перехватчик подходит.

package lr4;

public class Example7 {
    public static void main(String[] args) {
//        try {
//            System.out.println("0");
//            throw new NullPointerException("ошибка");
//        } catch (NullPointerException e) {
//            System.out.println("1");
//            throw new ArithmeticException();
//        } catch (ArithmeticException e) {
//            System.out.println("2");
//        }
//        System.out.println("3");

        try {
            System.out.println("0");
            throw new NullPointerException("ошибка");
        } catch (NullPointerException e) {
            System.out.println("1");
            try {
                throw new ArithmeticException();
            }
            catch (ArithmeticException d) {
                System.out.println("2");
            }
        }
        System.out.println("3");
    }
}
