package homeworks.homework1;

public class FigurePainter {
    public static void main(String[] args) {
        char c = '*';
        for (int i = 1; i <= 4; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
