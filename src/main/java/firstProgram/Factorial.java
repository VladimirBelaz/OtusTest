package firstProgram;

public class Factorial {
    static String calculateFactorial(int n) {
        if (n < 0) {
            return "Invalid number";
        }
        if (n == 0) {
            return "1";
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return String.valueOf(result);
    }

    public static void main(String[] args) {
        // Тестовые случаи
        System.out.println("3: " + calculateFactorial(3));
        System.out.println("5: " + calculateFactorial(5));
        System.out.println("6: " + calculateFactorial(6));
        System.out.println("7: " + calculateFactorial(7));
        System.out.println("10: " + calculateFactorial(10));
    }
}
