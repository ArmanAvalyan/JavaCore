package homeworks.homework7.bracechecker;

public class BraceCheckerDemo {

    public static void main(String[] args) {

        BraceChecker braceChecker = new BraceChecker("Hello(java()[jdk]]");
        braceChecker.check();
    }
}
