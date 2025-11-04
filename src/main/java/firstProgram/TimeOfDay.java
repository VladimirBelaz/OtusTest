package firstProgram;

public class TimeOfDay {
    public static String getTimeOfDay(int hour) {
        return switch (hour) {
            case 0, 1, 2, 3, 4, 5 -> "Ночь";
            case 6, 7, 8, 9, 10, 11 -> "Утро";
            case 12, 13, 14, 15, 16, 17 -> "День";
            case 18, 19, 20, 21, 22, 23 -> "Вечер";
            default -> "Неверный час! Введите число от 0 до 23.";
        };
    }

    public static void main(String[] args) {
        // Пример использования
        for (int i = 0; i <= 24; i++) {
            System.out.printf("%2d:00 - %s%n", i, getTimeOfDay(i));
        }
    }
}
