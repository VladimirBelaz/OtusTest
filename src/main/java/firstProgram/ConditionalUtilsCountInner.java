package firstProgram;

public class ConditionalUtilsCountInner {

    public static int countInnerNumber(int base, int checkNumber) {
        // Разбиваем четырехзначное число на три двузначных
        int firstTwo = base / 100;           // Первые две цифры
        int middleTwo = (base / 10) % 100;   // Средние две цифры
        int lastTwo = base % 100;            // Последние две цифры
        int count = 0;
        // Сравниваем каждое двузначное число с checkNumber
        if (firstTwo == checkNumber) {
            count++;
        }
        if (middleTwo == checkNumber) {
            count++;
        }
        if (lastTwo == checkNumber) {
            count++;
        }
        return count;
    }

    private ConditionalUtilsCountInner() {

    }

    public static void main(String[] args) {
        System.out.println("При вводе чисел 6522 и 22 метод должен вернуть 1 - "
                + ConditionalUtilsCountInner.countInnerNumber(6522, 22));

        // Дополнительные тесты
        System.out.println("Тест 1: 2222 и 22 = " + countInnerNumber(2222, 22)); // 3
        System.out.println("Тест 2: 1234 и 12 = " + countInnerNumber(1234, 12)); // 1
        System.out.println("Тест 3: 1234 и 23 = " + countInnerNumber(1234, 23)); // 1
        System.out.println("Тест 4: 1234 и 34 = " + countInnerNumber(1234, 34)); // 1
        System.out.println("Тест 5: 1111 и 11 = " + countInnerNumber(1111, 11)); // 3
        System.out.println("Тест 6: 1001 и 10 = " + countInnerNumber(1001, 10)); // 1
    }
}