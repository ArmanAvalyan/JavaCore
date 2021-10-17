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

        char[] bolola1 = {'b', 'o', 'l', 'o', 'l', 'a'};
        char firstSymbol = bolola1[bolola1.length / 2 - 1];
        char secondSymbol = bolola1[bolola1.length / 2];
        System.out.println("Middle 2 characters: " + firstSymbol + " " + secondSymbol);

        char[] bolola2 = {'b', 'o', 'l', 'o', 'l', 'a'};
        boolean req = false;
        if (bolola2[bolola2.length - 2] == 'l' && bolola2[bolola2.length - 1] == 'y') {
            req = true;
        }
        System.out.println("Array ends with ly characters? " + req);

        char[] bolola3 = {'b', '9', 'b', 'c', 'o', 'l', 'a'};
        boolean req1 = false;
        for (int i = 0; i < bolola3.length; i++) {
            if (bolola3[i] == 'b' && bolola3[i + 2] == 'b') {
                req1 = true;
                break;
            }
        }
        System.out.println("The array contains symbols 'b' * 'b'? " + req1);

        char[] text = {' ', ' ', ' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};
        char[] result = new char[5];
        int newIndex = 0;
        for (char value : text) {
            switch (value) {
                case ' ':
                    break;
                default:
                    result[newIndex] = value;
                    newIndex++;
            }
        }
        System.out.print("The new array: ");
        System.out.println(result);
    }
}
