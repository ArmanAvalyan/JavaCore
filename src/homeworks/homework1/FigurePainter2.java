package homeworks.homework1;

public class FigurePainter2 {
    public static void main(String[] args) {
        char ch1 = '*';
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3 - i; j++) {
                System.out.print("  ");
            }

            for (int j = 0; j < i + 1; j++) {
                System.out.print(ch1 + " ");
            }
            System.out.println();
        }
    }
}
