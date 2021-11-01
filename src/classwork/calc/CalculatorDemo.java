package classwork.calc;

public class CalculatorDemo {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        int a = 1450000000;
        int b = 36450;

        System.out.println(a + " + " + b + " = " + calculator.addition(a, b));
        System.out.println(a + " - " + b + " = " + calculator.subtraction(a, b));
        System.out.println(a + " * " + b + " = " + calculator.multiplication(a, b));
        System.out.println(a + " / " + b + " = " + calculator.division(a, b));
    }
}
