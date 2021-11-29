package homeworks.homework6;

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
        int newLength = size;
        array = newArray;
    }

    public void add(int value, int index) {
        if (index >= size || index < 0) {
            System.err.print("\nInvalid index ");
        } else {
            if (size == array.length) {
                extend();
            }
            for (int i = size - 1; i >= index; i--) {
                array[i + 1] = array[i];
            }
            array[index] = value;
            size++;
        }
    }

    public void add(int[] numbers) {
        for (int number : numbers) {
            add(number);
        }
    }

    public void set(int value, int index) {
        if (index >= size || index < 0) {
            System.err.print("\nInvalid index ");
        } else {
            array[index] = value;
        }
    }

    public void delete(int index) {
        if (index >= size || index < 0) {
            System.err.print("\nInvalid index ");
        } else {
            for (int i = index; i < size - 1; i++) {
                int temp = array[i + 1];
                array[i] = temp;
            }
            size--;
        }
    }


    public boolean isExist(int number) {
        for (int i = 0; i < size; i++) {
            if (array[i] == number) {
                return true;
            }
        }
        return false;
    }

    public boolean isEmpty() {
        return size == 0;
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
            System.err.print("\nInvalid index ");
            return -1;
        }
        return array[index];
    }
}