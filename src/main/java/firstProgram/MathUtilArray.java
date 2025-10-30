package firstProgram;

public class MathUtilArray {
    public static String getEvenNumbersUpTo(byte number) {
        if (number < 0) {
            return "";
        }
        if (number == 0) {
            return "1";
        }
        StringBuilder result = new StringBuilder();
        // Всегда добавляем 1
        result.append(1);
        // Добавляем четные числа от 2 до number-1
        for (int i = 2; i < number; i++) {
            if (i % 2 == 0) {
                result.append(i);
            }
        }
        // Добавляем само число, если оно больше 1
        if (number > 1) {
            result.append(number);
        }
        return result.toString();
    }

    private MathUtilArray() {
    }

    public static void main(String[] args) {
        System.out.println("Если передать число 5, то метод должен вернуть строку 1245 - " +
                MathUtilArray.getEvenNumbersUpTo((byte) 5));

        // Дополнительные тесты для проверки
        System.out.println("Для числа 0: " + MathUtilArray.getEvenNumbersUpTo((byte) 0)); // 1
        System.out.println("Для числа 1: " + MathUtilArray.getEvenNumbersUpTo((byte) 1)); // 1
        System.out.println("Для числа 2: " + MathUtilArray.getEvenNumbersUpTo((byte) 2)); // 12
        System.out.println("Для числа 3: " + MathUtilArray.getEvenNumbersUpTo((byte) 3)); // 123
        System.out.println("Для числа 4: " + MathUtilArray.getEvenNumbersUpTo((byte) 4)); // 124
        System.out.println("Для числа 6: " + MathUtilArray.getEvenNumbersUpTo((byte) 6)); // 1246
        System.out.println("Для отрицательного числа: " + MathUtilArray.getEvenNumbersUpTo((byte) -5)); // пустая строка
    }
}
