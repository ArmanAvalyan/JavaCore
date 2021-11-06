package homeworks.homwwork6;

public class DynamicArrayDemo {
    public static void main(String[] args) {

        DynamicArray dynamicArray = new DynamicArray();

        for (int i = 30; i > 0; i--) {
            dynamicArray.add(i);
        }

        dynamicArray.printArray();
        System.out.print("\n" + dynamicArray.getByIndex(-56));
    }
}
