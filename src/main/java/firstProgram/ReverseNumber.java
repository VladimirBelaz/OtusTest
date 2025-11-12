package firstProgram;

import java.util.Arrays;

public class ReverseNumber {

    static String reverseNumber(int number) {
        if (number == 0) {
            return "0";
        }

        boolean isNegative = number < 0;
        String numStr = Integer.toString(Math.abs(number));
        String reversed = new StringBuilder(numStr).reverse().toString();

        // Удаляем ведущие нули
        int i = 0;
        while (i < reversed.length() - 1 && reversed.charAt(i) == '0') {
            i++;
        }
        reversed = reversed.substring(i);

        return isNegative ? "-" + reversed : reversed;
    }

    public static void main(String[] args) {
        System.out.println("Expected 5 got " + reverseNumber(5));
        System.out.println("Expected 0 got " + reverseNumber(0));
        System.out.println("Expected 9 got " + reverseNumber(9));
        System.out.println("Expected 321 got " + reverseNumber(123));
        System.out.println("Expected 4321 got " + reverseNumber(1234));
        System.out.println("Expected 54321 got " + reverseNumber(12345));
        System.out.println("Expected -321 got " + reverseNumber(-123));
        System.out.println("Expected -4321 got " + reverseNumber(-1234));
        System.out.println("Expected -54321 got " + reverseNumber(-12345));
        System.out.println("Expected 021 got " + reverseNumber(120));
        System.out.println("Expected 1 got " + reverseNumber(100));
        System.out.println("Expected -21 got " + reverseNumber(-120));
    }
}