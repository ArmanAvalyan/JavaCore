package homeworks.homework7.bracechecker;

public class BraceChecker {

    private String text;

    public BraceChecker(String text) {
        this.text = text;
    }

    public void check() {
        Stack stack = new Stack();
        char openBrace;
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char brace = text.charAt(i);
            switch (brace) {
                case '(':
                case '{':
                case '[':
                    stack.push(brace);
                    count++;
                    break;
                case ')':
                    count--;
                    if ((openBrace = stack.pop()) != '(') {
                        errorMessage(openBrace, brace, i);
                    }
                    break;
                case '}':
                    count--;
                    if ((openBrace = stack.pop()) != '{') {
                        errorMessage(openBrace, brace, i);
                    }
                    break;
                case ']':
                    count--;
                    if ((openBrace = stack.pop()) != '[') {
                        errorMessage(openBrace, brace, i);
                    }
                    break;
            }
        }
        if (count != 0) {
            System.out.println("There is an unclosed brace");
        }
    }

    private void errorMessage(char openBrace, char closeBrace, int index) {
        System.err.println("Error: Opened " + openBrace +
                " but closed " + closeBrace + " at " + index);
    }
}

