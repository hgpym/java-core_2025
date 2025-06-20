//Последовательность перехвата должна соответствовать
//иерархии классов исключений. Предок не должен перехватывать
//исключения раньше потомков. Указанный пример выдает ошибку
//компилятора. Программу запустить невозможно.

package lr4;

public class Example6 {
    public static void main(String[] args) {
//        try {
//            System.out.println("0");
//            throw new NullPointerException("ошибка");
//        } catch (ArithmeticException e) {
//            System.out.println("1");
//        } catch (Exception e) {
//            System.out.println("2");
//        } catch (RuntimeException e) {
//            System.out.println("3");
//        }
//        System.out.println("4");

        try {
            System.out.println("0");
            throw new NullPointerException("ошибка");
        } catch (ArithmeticException e) {
            System.out.println("1");
        } catch (RuntimeException e) {
            System.out.println("2");
        } catch (Exception e) {
            System.out.println("3");
        }
        System.out.println("4");
    }
}
