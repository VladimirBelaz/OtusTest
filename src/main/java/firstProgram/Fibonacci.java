package firstProgram;

public class Fibonacci {
    static int[] fibonacci(int n) {
        if(n <= 0) {
            return new int[0];
        }
        if (n == 1) {
            return new int[]{0};
        }
        int[] temp = new int[n];
        temp[0] = 0;
        temp[1] = 1;
        for (int i = 2; i < n; ++i) {
            temp[i] = temp[i - 1] + temp[i - 2];
        }
        return temp;
    }

    public static void main(String[] args) {
        // Тестовые случаи
        System.out.println("Факториал 0: " + fibonacci(0));     // 1
        System.out.println("Факториал 1: " + fibonacci(1));     // 1
        System.out.println("Факториал 5: " + fibonacci(5));     // 120
        System.out.println("Факториал 6: " + fibonacci(6));   // 3628800
        System.out.println("Факториал 10: " + fibonacci(10));   // Invalid number
    }
}
