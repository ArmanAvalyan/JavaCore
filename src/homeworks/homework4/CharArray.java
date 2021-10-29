package homeworks.homework4;

public class CharArray {

    int getCharCount(char c, char[] array) {
        int count = 0;
        for (char value : array) {
            if (value == c) {
                count++;
            }
        }
        return count;
    }

    void printMiddleCharacters(char[] array) {
        char firstSymbol = array[array.length / 2 - 1];
        char secondSymbol = array[array.length / 2];
        System.out.print("\nMiddle 2 characters: " + '\'' +
                firstSymbol + '\'' + " " + '\'' + secondSymbol + '\'');
    }

    boolean requestEndingSymbols(char symbol1, char symbol2, char[] array) {
        return array[array.length - 2] == symbol1 && array[array.length - 1] == symbol2;
    }

    boolean requestTwoSymbols(char symbol1, char[] array) {
        for (int i = 0; i < array.length - 2; i++) {
            if (array[i] == symbol1 && array[i + 2] == symbol1) {
                return true;
            }
        }
        return false;
    }

    char[] result(char[] array) {
        int a = array.length;
        int b = 0;
        while (array[b] == ' ') {
            b++;
        }
        while (array[a - 1] == ' ') {
            a--;
        }
        char[] result = new char[a - b];
        for (int i = 0; i < result.length; i++) {
            result[i] = array[b + i];
        }
        return result;
    }
}
