package firstProgram;

import java.util.Arrays;

public class Repeat {

    public static int[] generateArrWithFibanachi(int length) {
        if (length <= 0) {
            return new int[0];
        }

        int[] result = new int[length];

        for (int i = 0; i < length; i++) {
            if (i == 0) {
                result[i] = 1;
            } else if (i == 1) {
                result[i] = 2;
            } else {
                result[i] = result[i - 1] + result[i - 2];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(generateArrWithFibanachi(-1))); // []
        System.out.println(Arrays.toString(generateArrWithFibanachi(0)));  // []
        System.out.println(Arrays.toString(generateArrWithFibanachi(1)));  // [1]
        System.out.println(Arrays.toString(generateArrWithFibanachi(2)));  // [1, 2]
        System.out.println(Arrays.toString(generateArrWithFibanachi(3)));  // [1, 2, 3]
        System.out.println(Arrays.toString(generateArrWithFibanachi(4)));  // [1, 2, 3, 5]
        System.out.println(Arrays.toString(generateArrWithFibanachi(5)));  // [1, 2, 3, 5, 8]
    }
}