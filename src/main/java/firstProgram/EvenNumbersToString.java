package firstProgram;

public class EvenNumbersToString {
    static String printEvenNumbersToString(int n) {
        String result = "";
        for (int i = 2; i <= n; i += 2) {
            result += i;
            if (i + 2 <= n) {
                result += ", ";
            }
        }
        return result.trim();
    }

    public static void main(String[] args) {
        // Тестовые случаи
        System.out.println("10: " + printEvenNumbersToString(10));     // 1
        System.out.println("20: " + printEvenNumbersToString(20));     // 1
        System.out.println("30: " + printEvenNumbersToString(30));     // 120
        System.out.println("40: " + printEvenNumbersToString(40));   // 3628800
        System.out.println("100: " + printEvenNumbersToString(100));   // Invalid number
    }
}
