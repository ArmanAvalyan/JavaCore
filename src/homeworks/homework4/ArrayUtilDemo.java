package homeworks.homework4;

public class ArrayUtilDemo {
    public static void main(String[] args) {

        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = {74, 36, 4, 145, 8, 11, -14, 0};

        arrayUtil.printArray(array);

        int maxNumber = arrayUtil.getMaxNumber(array);
        System.out.print("\nMax number = " + maxNumber);

        int minNumber = arrayUtil.getMinNumber(array);
        System.out.print("\nMin number = " + minNumber);

        int countEven = arrayUtil.getCountEven(array);
        System.out.print("\nCount of even numbers = " + countEven);

        int countOdd = arrayUtil.getCountOdd(array);
        System.out.print("\nCount of odd numbers = " + countOdd);

        int sum = arrayUtil.getElementsSum(array);
        System.out.print("\nThe sum = " + sum);

        double arithmeticAverage = arrayUtil.getArithmeticAverage(array);
        System.out.print("\nArithmetic average = " + arithmeticAverage);

        arrayUtil.arraySortingAsc(array);
        System.out.println("\nArray sorted by asc");
        arrayUtil.printArray(array);

        arrayUtil.arraySortingDesc(array);
        System.out.println("\nArray sorted by desc");
        arrayUtil.printArray(array);
    }
}
