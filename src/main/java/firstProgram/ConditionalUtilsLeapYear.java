package firstProgram;

public class ConditionalUtilsLeapYear {
    public static boolean isLeapYear(int inputYear) {
        // Год является високосным, если:
        // 1. Он делится на 4 И НЕ делится на 100
        // 2. ИЛИ он делится на 400
        return (inputYear % 4 == 0 && inputYear % 100 != 0) || (inputYear % 400 == 0);
    }

    private ConditionalUtilsLeapYear() {

    }

    public static void main(String[] args) {
        System.out.println("При вводе числа 2004, метод должен вернуть true - " +
                ConditionalUtilsLeapYear.isLeapYear(2004));

        // Дополнительные тесты
        System.out.println("2000 (делится на 400) - " + isLeapYear(2000)); // true
        System.out.println("1900 (делится на 100, но не на 400) - " + isLeapYear(1900)); // false
        System.out.println("2024 (делится на 4, но не на 100) - " + isLeapYear(2024)); // true
        System.out.println("2023 (не делится на 4) - " + isLeapYear(2023)); // false
        System.out.println("1600 (делится на 400) - " + isLeapYear(1600)); // true
        System.out.println("1700 (делится на 100, но не на 400) - " + isLeapYear(1700)); // false
    }
}
