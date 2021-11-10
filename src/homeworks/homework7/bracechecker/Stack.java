package homeworks.homework7.bracechecker;

public class Stack {

    private char[] array = new char[10];
    private int size;

    public Stack() {
        size = -1;
    }

    public void push(char value) {
        if (size == array.length) {
            System.out.println("Stack is full");
        } else {
            array[++size] = value;
        }
    }

    public char pop() {
        if (size < 0) {
            System.out.println("Stack is empty");
            return 0;
        } else {
            return array[size--];
        }
    }

    public void print(char[] array) {
        for (char c : array) {
            System.out.print(c + " ");
        }
    }
}
