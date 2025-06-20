//Вывести число Фибоначчи, заданное его номером в
//последовательности.
//Последовательность Фибоначчи формируется так: нулевой член
//последовательности равен нулю, первый – единице, а каждый следующий
//– сумме двух предыдущих.

package lr3;

public class Example5 {
    public static void main(String[] args) {
        System.out.println(fact(5));
        System.out.println(fib(5, 0));
    }

    public static int fact(int n) {
        if (n == 0)
        {
            return 0;
        }
        else if (n == 1)
        {
            return 1;
        }
        else {
            return fact(n - 2) + fact(n - 1);
        }
    }

    public static int fib(int n, int depth) {
        String space = "  ".repeat(depth);
        System.out.println(space + "Вызов fib(" + n + ")");

        if (n == 0) {
            System.out.println(space + "fib(" + n + ") = 0");
            return 0;
        } else if (n == 1) {
            System.out.println(space + "fib(" + n + ") = 1");
            return 1;
        } else {
            int result1 = fib(n - 1, depth + 1);
            int result2 = fib(n - 2, depth + 1);
            int result = result1 + result2;
            System.out.println(space + "fib(" + n + ") = " + result);
            return result;
        }
    }
}
