package firstProgram;

public class ConditionalUtilsTriangleSides {
    public static boolean isTriangleSides(int aSide, int bSide, int cSide) {
        // Проверяем, что все стороны положительные
        if (aSide <= 0 || bSide <= 0 || cSide <= 0) {
            return false;
        }

        // Проверяем неравенство треугольника
        return (aSide + bSide > cSide) &&
                (aSide + cSide > bSide) &&
                (bSide + cSide > aSide);
    }

    private ConditionalUtilsTriangleSides() {

    }

    public static void main(String[] args) {
        System.out.println("При вводе сторон треугольника 1, 2 и 3, метод должен вернуть false - "
                + ConditionalUtilsTriangleSides.isTriangleSides(1, 2, 3));
    }
}
