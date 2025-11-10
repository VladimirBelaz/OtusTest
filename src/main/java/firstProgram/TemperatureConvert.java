package firstProgram;

public class TemperatureConvert {
    public static void main(String[] args) {
        // Тесты из задания
        System.out.println("C to F: " + convertTemperature(0, "C", "F")); // Ожидается: 32.00 °F
        System.out.println("F to C: " + convertTemperature(0, "F", "C")); // Ожидается: -17.78 °C
        System.out.println("C to K: " + convertTemperature(0, "C", "K")); // Ожидается: 273.15 °K
        System.out.println("K to C: " + convertTemperature(0, "K", "C")); // Ожидается: -273.15 °C
        // Тесты с невалидными шкалами
        System.out.println("Invalid scale X to C: " + convertTemperature(0, "X", "C"));
        System.out.println("Invalid scale C to Z: " + convertTemperature(0, "C", "Z"));
    }
    static String convertTemperature(double value, String from, String to) {
        // Проверка валидности шкал
        if (!from.equals("C") && !from.equals("F") && !from.equals("K")) {
            return "Invalid scale";
        }
        if (!to.equals("C") && !to.equals("F") && !to.equals("K")) {
            return "Invalid scale";
        }
        // Если шкалы одинаковые, возвращаем исходное значение
        if (from.equals(to)) {
            return String.format("%.2f °%s", value, to);
        }
        double result = 0;
        // Прямые преобразования между всеми шкалами
        if (from.equals("C") && to.equals("F")) {
            result = (value * 9.0 / 5.0) + 32;
        } else if (from.equals("C") && to.equals("K")) {
            result = value + 273.15;
        } else if (from.equals("F") && to.equals("C")) {
            result = (value - 32) * 5.0 / 9.0;
        } else if (from.equals("F") && to.equals("K")) {
            result = (value - 32) * 5.0 / 9.0 + 273.15;
        } else if (from.equals("K") && to.equals("C")) {
            result = value - 273.15;
        } else if (from.equals("K") && to.equals("F")) {
            result = (value - 273.15) * 9.0 / 5.0 + 32;
        }
        return String.format("%.2f °%s", result, to);
    }
}
