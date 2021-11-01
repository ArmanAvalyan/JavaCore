package classwork;

import classwork.calc.Calculator;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a");
        int a = scanner.nextInt();
        System.out.println("Please input b");
        int b = scanner.nextInt();

        Calculator calculator = new Calculator();
        System.out.println("Enter operation (+, -, *, /)");
        String str = scanner.next();
        switch (str) {
            case "+":
                System.out.println(calculator.addition(a, b));
                break;
            case "-":
                System.out.println(calculator.subtraction(a, b));
                break;
            case "*":
                System.out.println(calculator.multiplication(a, b));
                break;
            case "/":
                System.out.println(calculator.division(a, b));
                break;
            default:
                System.out.println("There is no such operation");
        }
    }
}
