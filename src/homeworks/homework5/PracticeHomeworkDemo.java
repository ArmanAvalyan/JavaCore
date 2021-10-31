package homeworks.homework5;

public class PracticeHomeworkDemo {
    public static void main(String[] args) {

        PracticeHomework practiceHomework = new PracticeHomework();

        int minutes = 36000;
        long seconds = practiceHomework.convert(minutes);
        System.out.println(minutes + " minutes = " + seconds + " seconds");

        int years = 12;
        int days = practiceHomework.calcAge(years);
        System.out.println(years + " years = " + days + " days");

        int number = -1;
        int nextNumber = practiceHomework.nextNumber(number);
        System.out.println(number + " next " + nextNumber);

        int number1 = 25;
        int number2 = 5;
        boolean isSame = practiceHomework.isSameNum(number1, number2);
        System.out.println(number1 + " and " + number2 + " is same? " + isSame);

        int number3 = 1;
        boolean req = practiceHomework.lessThanEqualToZero(number3);
        System.out.println(number3 + " <= 0? " + req);

        boolean value = true;
        boolean reverseValue = practiceHomework.reverseBool(value);
        System.out.println(value + " --> negated value --> " + reverseValue);

        int[] array1 = {1, 2, 3, 4, 5, 6};
        int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int maxLength = practiceHomework.maxLength(array1, array2);
        System.out.println("Max length = " + maxLength);
    }
}
