package chapter3;

public class Average {
    public static void main(String[] args) {
        double[] numbers = {10.1, 11.2, 12.3, 13.4, 14.5};
        double result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result = result + numbers[i];
        }
        System.out.println("Average is " + result / (numbers.length));
    }
}