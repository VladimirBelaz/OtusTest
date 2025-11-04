package firstProgram;

public class FactorialCalculator {
    public static String calculateFactorial(int n) {
        // Проверка на отрицательное число
        if (n < 0) {
            return "Invalid number";
        }

        // Факториал 0 равен 1
        if (n == 0) {
            return "1";
        }

        // Вычисление факториала для положительных чисел
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return String.valueOf(factorial);
    }

    // Метод для тестирования
    public static void main(String[] args) {
        // Тестовые случаи
        System.out.println("Факториал 0: " + calculateFactorial(0));     // 1
        System.out.println("Факториал 1: " + calculateFactorial(1));     // 1
        System.out.println("Факториал 5: " + calculateFactorial(5));     // 120
        System.out.println("Факториал 10: " + calculateFactorial(10));   // 3628800
        System.out.println("Факториал -3: " + calculateFactorial(-3));   // Invalid number
    }
}
