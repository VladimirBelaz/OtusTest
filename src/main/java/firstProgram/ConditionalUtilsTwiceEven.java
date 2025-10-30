package firstProgram;

public class ConditionalUtilsTwiceEven {
    public static boolean isDoublePrime(int inputNumber) {
        // Проверяем, что число трехзначное
        if (inputNumber < 100 || inputNumber > 999) {
            return false;
        }

        // Разбиваем число на цифры
        int hundreds = inputNumber / 100;
        int tens = (inputNumber / 10) % 10;
        int units = inputNumber % 10;

        // Вычисляем сумму и произведение цифр
        int sum = hundreds + tens + units;
        int product = hundreds * tens * units;

        // Проверяем, что сумма и произведение четные
        return sum % 2 == 0 && product % 2 == 0;
    }

    private ConditionalUtilsTwiceEven() {

    }

    public static void main(String[] args) {
        System.out.println("При вводе числа 222 метод должен вернуть true - " +
                ConditionalUtilsTwiceEven.isDoublePrime(222));

        // Дополнительные тесты
        System.out.println("Тест 1: 246 (четные цифры) - " + isDoublePrime(246)); // true
        System.out.println("Тест 2: 123 (нечетная сумма) - " + isDoublePrime(123)); // false
        System.out.println("Тест 3: 135 (нечетное произведение) - " + isDoublePrime(135)); // false
        System.out.println("Тест 4: 99 (не трехзначное) - " + isDoublePrime(99)); // false
        System.out.println("Тест 5: 1000 (не трехзначное) - " + isDoublePrime(1000)); // false
        System.out.println("Тест 6: 224 (сумма=8, произведение=16) - " + isDoublePrime(224)); // true
    }
}
