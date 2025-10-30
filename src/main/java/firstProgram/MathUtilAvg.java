package firstProgram;

public class MathUtilAvg {
    public static int getPrimeNumbersSum(byte lowEdge, byte highEdge) {
        // Проверка условий
        if (lowEdge < 0 || lowEdge >= highEdge) {
            return 0;
        }

        int sum = 0;
        int count = 0;

        // Проходим по всем числам в диапазоне
        for (int i = lowEdge; i <= highEdge; i++) {
            if (i % 2 == 0) { // Проверяем четность
                sum += i;
                count++;
            }
        }

        // Если четных чисел нет, возвращаем 0
        if (count == 0) {
            return 0;
        }

        // Вычисляем среднее и округляем в меньшую сторону
        return sum / count;
    }

    private MathUtilAvg() {

    }

    public static void main(String[] args) {
        System.out.println("avg четных чисел у ряда с 1 до 10 должен равняться 6 - "
                + MathUtilAvg.getPrimeNumbersSum((byte) 1, (byte) 10));

        // Дополнительные тесты
        System.out.println("avg четных чисел у ряда с 2 до 8 должен равняться 5 - "
                + MathUtilAvg.getPrimeNumbersSum((byte) 2, (byte) 8)); // 2+4+6+8=20/4=5
        System.out.println("Проверка на отрицательное число - "
                + MathUtilAvg.getPrimeNumbersSum((byte) -1, (byte) 5)); // 0
        System.out.println("Проверка когда lowEdge >= highEdge - "
                + MathUtilAvg.getPrimeNumbersSum((byte) 10, (byte) 5)); // 0
        System.out.println("Проверка когда нет четных чисел - "
                + MathUtilAvg.getPrimeNumbersSum((byte) 1, (byte) 1)); // 0
        System.out.println("Проверка когда нет четных чисел в допустимом диапазоне - "
                + MathUtilAvg.getPrimeNumbersSum((byte) 1, (byte) 2)); // четные: 2 -> сумма=2, количество=1 -> 2/1=2
    }
}
