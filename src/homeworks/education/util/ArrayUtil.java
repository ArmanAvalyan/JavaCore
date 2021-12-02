package homeworks.education.util;

public class ArrayUtil {

    public static void deleteByIndex(Object[] array, int index, int size) {
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
    }
}
