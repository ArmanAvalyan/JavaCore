package homeworks;

public class SortArray {
    public static void main(String[] args) {
        // Array sorting
        int[] array = {1200, 36, 4, 147, 1, 78, -4, 7};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
