package homeworks.homework4;

public class ArrayUtil {

    void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    int getMaxNumber(int[] array) {
        int maxNumber = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxNumber) {
                maxNumber = array[i];
            }
        }
        return maxNumber;
    }

    int getMinNumber(int[] array) {
        int minNumber = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minNumber) {
                minNumber = array[i];
            }
        }
        return minNumber;
    }

    int getCountEven(int[] array) {
        int countEven = 0;
        for (int i : array) {
            if (i % 2 == 0) {
                countEven++;
            }
        }
        return countEven;
    }

    int getCountOdd(int[] array) {
        int countOdd = 0;
        for (int i : array) {
            if (i % 2 == 1) {
                countOdd++;
            }
        }
        return countOdd;
    }

    int getElementsSum(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum = sum + i;
        }
        return sum;
    }

    double getArithmeticAverage(int[] array) {
        double arithmeticAverage;
        arithmeticAverage = (double) getElementsSum(array) / array.length;
        return arithmeticAverage;
    }

     int[] arraySortingAsc(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    int[] arraySortingDesc(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
