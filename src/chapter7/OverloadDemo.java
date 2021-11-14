package chapter7;

public class OverloadDemo {
    public static void main(String[] args) {
        Overload overload = new Overload();
        double result;
        int i = 88;

        overload.test();
        overload.test(10);
        overload.test(10, 20);
        result = overload.test(123.25);
        System.out.println("Result of overload.test(13.25): " + result);
    }
}
