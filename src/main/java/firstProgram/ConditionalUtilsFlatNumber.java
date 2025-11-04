package firstProgram;

public class ConditionalUtilsFlatNumber {
    public static boolean isDescendingNumber(int inputNumber) {
        if (inputNumber < 100 || inputNumber > 999) {
            return false;
        }

        int hundreds = inputNumber / 100;
        int tens = (inputNumber / 10) % 10;
        int units = inputNumber % 10;

        return hundreds == tens && tens == units;
    }

    private ConditionalUtilsFlatNumber() {
    }

    public static void main(String[] args) {
        System.out.println("При вводе числа 777 метод должен вернуть true - " + ConditionalUtilsFlatNumber.isDescendingNumber(777));
    }
}
