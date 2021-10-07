package homeworks.homework1;

public class FigurePainter3 {
    public static void main(String[] args) {
        char c = '*';
        for (int i = 1; i <= 4; i++) {
            for (int j = 0; j <= 4 - i; j++) {
                System.out.print(c + " ");
            }
            System.out.println();
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
        }
    }
}
