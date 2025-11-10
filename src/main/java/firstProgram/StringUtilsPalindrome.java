package firstProgram;

public class StringUtilsPalindrome {
    public static boolean isPalindrome(String input) {
        if (input == null) {
            return false;
        }
        // Оставляем только буквы и цифры, игнорируем спецсимволы, пробелы и т.д.
        String cleanedInput = input.replaceAll("[^a-zA-Zа-яА-Я0-9]", "").toLowerCase();

        // Проверяем пустую строку после очистки
        if (cleanedInput.isEmpty()) {
            return false;
        }
        int left = 0;
        int right = cleanedInput.length() - 1;

        while (left < right) {
            if (cleanedInput.charAt(left) != cleanedInput.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    private StringUtilsPalindrome() {
        // Приватный конструктор для утильного класса
    }

    public static void main(String[] args) {
        // Тест 1: Обычный палиндром
        System.out.println("При вводе строки \"шалаш\" метод должен вернуть true - " +
                StringUtilsPalindrome.isPalindrome("шалаш"));

        // Тест 2: Палиндром со спецсимволами
        System.out.println("При вводе строки \"А роза упала на лапу Азора!\" метод должен вернуть true - " +
                StringUtilsPalindrome.isPalindrome("А роза упала на лапу Азора!"));

        // Тест 3: Палиндром с разными спецсимволами
        System.out.println("При вводе строки \"Madam, I'm Adam\" метод должен вернуть true - " +
                StringUtilsPalindrome.isPalindrome("Madam, I'm Adam"));

        // Тест 4: Не палиндром
        System.out.println("При вводе строки \"Произвольная фраза\" метод должен вернуть false - " +
                StringUtilsPalindrome.isPalindrome("Произвольная фраза"));

        // Тест 5: Палиндром с цифрами и спецсимволами
        System.out.println("При вводе строки \"11/02/2011\" метод должен вернуть true - " +
                StringUtilsPalindrome.isPalindrome("11/02/2011"));
    }
}
