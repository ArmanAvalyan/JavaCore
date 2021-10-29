package homeworks.homework4;

public class CharArrayDemo {
    public static void main(String[] args) {

        CharArray charArray = new CharArray();

        char[] array = {' ', 'H', 'e', 'l', 'l', 'o', ' ',
                'w', 'o', 'r', 'l', 'd', ' '};
        System.out.println(array);

        char c = 'l';
        int count = charArray.getCharCount(c, array);
        if (array.length == 0) {
            System.out.println("The array is  empty");
        } else {
            System.out.print("Count of " + '\'' + c + '\'' + " = " + count);
        }

        charArray.printMiddleCharacters(array);
        char symbol1 = 'k';
        char symbol2 = 'c';
        boolean req;

        req = charArray.requestEndingSymbols(symbol1, symbol2, array);
        System.out.print("\nArray ends with ly characters? " + req);

        symbol1 = 'l';
        req = charArray.requestTwoSymbols(symbol1, array);
        System.out.println("\nThe array contains symbols " + '\'' + symbol1 + '\'' +
                "*" + '\'' + symbol1 + '\'' + "? " + req);

        char[] result = charArray.result(array);
        System.out.print("The new array: ");
        System.out.println(result);
    }
}
