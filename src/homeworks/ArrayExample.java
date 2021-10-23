package homeworks;

public class ArrayExample {
    public static void main(String[] args) {
        int[] array = {2, -2, 4, 12, 2, 0, 44, 7, 0, -2};
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println(array[i] + " is duplicate");
                    break;
                }
            }
        }

        boolean isEven = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                isEven = false;
                break;
            }
        }
        System.out.println(isEven);
    }
}
