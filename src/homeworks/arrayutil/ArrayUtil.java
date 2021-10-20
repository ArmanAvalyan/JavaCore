package homeworks.arrayutil;

public class ArrayUtil {
    public static void main(String[] args) {

        int[] array = {2, 3, -8, 9, 0, 14, -78, 43, 58, 1245};

        // Print the elements of the array
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // Find the largest number of array
        int maxNumber = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxNumber) {
                maxNumber = array[i];
            }
        }
        System.out.println("The largest number = " + maxNumber);

        // Find the smallest number of array
        int minNumber = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minNumber) {
                minNumber = array[i];
            }
        }
        System.out.println("The smallest number = " + minNumber);

        // Find the even numbers of array and print
        int countEven = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                countEven++;
                System.out.print(array[i] + " ");
            }
        }
        System.out.println("\nNumber of even numbers = " + countEven);

        // Find the odd numbers of array and print
        int countOdd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                countOdd++;
                System.out.print(array[i] + " ");
            }
        }
        System.out.println("\nNumber of odd numbers = " + countOdd);

        // Find the arithmetic mean of the elements of the array
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        double arithmeticAverage;
        arithmeticAverage = (double) sum / array.length;
        System.out.println("Arithmetic mean = " + arithmeticAverage);
    }
}
