package homeworks.education.util;

public class ArrayUtil {

    public static void deleteByIndex(Object[] array, int index, int size) {
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
    }

    public static String arrayToString(Object[] array) {
        StringBuilder tmp = new StringBuilder();
        System.out.println("-------------------");
        for (Object o : array) {
            tmp.append('\n').append(o);
        }
        return tmp.toString();
    }
}
