package chapter7;

public class Overload {
    void test() {
        System.out.println("No parameters");
    }

    void test(int a, int b) {
        System.out.println("a and b: " + a + " " + b);
    }

    void test(int a) {
        System.out.println("a: " + a);
    }

    double test(double a) {
        System.out.println("double a: " + a);
        return a * a;
    }
}
