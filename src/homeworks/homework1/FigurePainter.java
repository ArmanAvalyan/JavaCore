package homeworks.homework1;

public class FigurePainter {
    public static void main(String[] args) {
        char[][] arr = new char[4][];
        arr[0] = new char[1];
        arr[1] = new char[2];
        arr[2] = new char[3];
        arr[3] = new char[4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i + 1; j++) {
                arr[i][j] = '*';
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
