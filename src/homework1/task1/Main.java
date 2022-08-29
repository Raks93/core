package homework1.task1;

public class Main {

    public static void main(String[] args) {
        int side = 4;
        int[][] array = createRandomSquareArray(side);
        printSquareArray(array, side);
        System.out.println("Минимальное значение массива = " + getMinFromSquareArray(array, side));
        System.out.println("Максимальное значение массива = " + getMaxFromSquareArray(array, side));
        System.out.println("Среднее значение массива = " + getAverageFromSquareArray(array, side));
    }

    private static int[][] createRandomSquareArray(int side) {
        if (side < 1) {
            return new int[1][1];
        }

        int[][] newArray = new int[side][side];
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                newArray[i][j] = (int) (Math.random() * 10);
            }
        }
        return newArray;
    }

    private static void printSquareArray(int[][] array, int side) {
        if (side < 1 || array.length != side) {
            return;
        }

        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                System.out.print("\t" + array[i][j]);
            }
            System.out.println();
        }
    }

    private static int getMinFromSquareArray(int[][] array, int side) {
        if (side < 1 || array.length != side) {
            return 0;
        }

        int minimum = array[0][0];
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                if (minimum > array[i][j]) {
                    minimum = array[i][j];
                }
            }
        }

        return minimum;
    }

    private static int getMaxFromSquareArray(int[][] array, int side) {
        if (side < 1 || array.length != side) {
            return 0;
        }

        int maximum = array[0][0];
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                if (maximum < array[i][j]) {
                    maximum = array[i][j];
                }
            }
        }

        return maximum;
    }

    private static double getAverageFromSquareArray(int[][] array, int side) {
        if (side < 1 || array.length != side) {
            return 0;
        }

        int sum = 0;
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                sum += array[i][j];
            }
        }

        return ((double) sum) / Math.pow(side, 2);
    }
}
