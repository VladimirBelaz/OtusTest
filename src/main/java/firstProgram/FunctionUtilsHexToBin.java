package firstProgram;

class FunctionUtilsHexToBin {
    public static void main(String[] args) {
        System.out.println("17 → " + hexToBin("17")); // 10111
        System.out.println("A  → " + hexToBin("A"));  // 1010
        System.out.println("F  → " + hexToBin("F"));  // 1111
    }
    public static String hexToBin(String hexBase) {
        // Шаг 1: Hex → Decimal
        int decimal = 0;
        int power = 1; // Начинаем с младшего разряда (16^0)

        // Идем по строке справа налево
        for (int i = hexBase.length() - 1; i >= 0; i--) {
            char c = hexBase.charAt(i);
            int digit;

            // Преобразуем символ в числовое значение
            if (c >= '0' && c <= '9') {
                digit = c - '0';        // '0'=48, '1'=49 → 1=49-48
            } else if (c >= 'A' && c <= 'F') {
                digit = 10 + (c - 'A'); // 'A'=65 → 10=10+(65-65)
            } else if (c >= 'a' && c <= 'f') {
                digit = 10 + (c - 'a'); // 'a'=97 → 10=10+(97-97)
            } else {
                return "0"; // Недопустимый символ
            }
            // Умножаем цифру на степень 16 и добавляем к результату
            decimal += digit * power;
            power *= 16; // Увеличиваем степень для следующего разряда
        }

        // Шаг 2: Decimal → Binary через деление
        if (decimal == 0) {
            return "0";
        }

        StringBuilder binary = new StringBuilder();
        int num = decimal;

        // Делим число на 2 пока оно не станет 0
        while (num > 0) {
            int remainder = num % 2;  // Получаем остаток (0 или 1)
            binary.insert(0, remainder); // Добавляем в начало строки
            num = num / 2;           // Целочисленное деление
        }

        return binary.toString();
    }
}
