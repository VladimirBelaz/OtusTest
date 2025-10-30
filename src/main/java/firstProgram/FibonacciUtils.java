package firstProgram;
import java.math.BigInteger;

public class FibonacciUtils {
    public static String getFibonacciSum(byte limit) {
        if (limit <= 0) {
            return "0";
        }

        if (limit == 1) {
            return "0";
        }

        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;
        BigInteger sum = BigInteger.ZERO.add(a).add(b); // F0 + F1 = 0 + 1

        for (int i = 2; i < limit; i++) {
            BigInteger next = a.add(b);
            sum = sum.add(next);
            a = b;
            b = next;
        }

        return sum.toString();
    }

    private FibonacciUtils() {
    }

    public static void main(String[] args) {
        System.out.println("Сумма чисел фибоначчи до 5 должна равняться 7 - " +
                FibonacciUtils.getFibonacciSum((byte) 5));
        System.out.println("Сумма чисел фибоначчи до 2 должна равняться 1 - " +
                FibonacciUtils.getFibonacciSum((byte) 2));
        System.out.println("Сумма чисел фибоначчи до 1 должна равняться 0 - " +
                FibonacciUtils.getFibonacciSum((byte) 1));
        System.out.println("Сумма чисел фибоначчи до 0 должна равняться 0 - " +
                FibonacciUtils.getFibonacciSum((byte) 0));
        System.out.println("Сумма чисел фибоначчи до 6 должна равняться 12 - " +
                FibonacciUtils.getFibonacciSum((byte) 6));
    }
}
