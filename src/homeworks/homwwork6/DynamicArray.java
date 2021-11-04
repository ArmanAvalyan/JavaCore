package homeworks.homwwork6;

public class DynamicArray {

    private int[] array = new int[10];
    private int size = 0;

    public void add(int value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;
    }

    private void extend() {
        int[] newArray = new int[array.length + 10];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    public void printArray() {
        if (size == 0) {
            System.out.println("Array is empty");
        }
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public int getByIndex(int index) {
        if (index >= size || index < 0) {
            System.out.print("\nInvalid index ");
            return -1;
        }
        return array[index];
    }
}