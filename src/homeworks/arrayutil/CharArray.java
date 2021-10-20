package homeworks.arrayutil;

public class CharArray {
    public static void main(String[] args) {
        char[] bolola = {'b', 'o', 'l', 'o', 'l', 'a'};
        char c = 'o';
        int count = 0;
        for (char value : bolola) {
            if (value == c) {
                count++;
            }
        }
        System.out.println("There are " + count + " of the specified character");

        System.out.println("-------------------------------------");

        // Print middle two elements
        char[] bolola1 = {'b', 'o', 'l', 'o', 'l', 'a'};
        char firstSymbol = bolola1[bolola1.length / 2 - 1];
        char secondSymbol = bolola1[bolola1.length / 2];
        System.out.println("Middle 2 characters: " + firstSymbol + " " + secondSymbol);

        System.out.println("-------------------------------------");

        // Тhe array ends with the specified elements
        char[] bolola2 = {'b', 'o', 'l', 'o', 'l', 'a'};
        boolean req = false;
        if (bolola2[bolola2.length - 2] == 'l' && bolola2[bolola2.length - 1] == 'y') {
            req = true;
        }
        System.out.println("Array ends with ly characters? " + req);

        System.out.println("-------------------------------------");

        // Interesting task
        char[] bolola3 = {'b', '9', 'b', 'c', 'o', 'l', 'a'};
        boolean req1 = false;
        for (int i = 0; i < bolola3.length; i++) {
            if (bolola3[i] == 'b' && bolola3[i + 2] == 'b') {
                req1 = true;
                break;
            }
        }
        System.out.println("The array contains symbols 'b' * 'b'? " + req1);

        System.out.println("-------------------------------------");

        // Trim whitespace
        char[] text = {' ', ' ', 'H', 'e', 'l', 'l', 'o', ' ',
                'w', 'o', 'r', 'l', 'd', ' ', ' '};
        int a = text.length;
        int b = 0;
        while (text[b] == ' ') {
            b++;
        }
        while (text[a - 1] == ' ') {
            a--;
        }
        char[] result = new char[a - b];
        for (int i = 0; i < result.length; i++) {
            result[i] = text[b + i];
        }
        System.out.print("The new array: ");
        System.out.println(result);

        System.out.println("-------------------------------------");

        // Array sorting
        int[] array = {1200, 36, 4, 147, 1, 78, -4, 7};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
