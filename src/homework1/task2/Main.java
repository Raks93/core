package homework1.task2;

public class Main {
    public static void main(String[] args) {
        int[] array = bubbleSortArray(new int[]{5, 6, 3, 2, 5, 1, 4, 9});
        printArray(array);
    }

    private static int[] bubbleSortArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j - 1] > array[j]) {
                    int temporaryNumber = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temporaryNumber;
                }
            }
        }
        return array;
    }

    private static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
