package chapter7;

public class Test {
    int a, b;

    Test(int i, int j) {
        a = i;
        b = j;
    }

    Test() {

    }

    void meth(int i, int j) {
        i *= 2;
        j /= 2;
    }

    boolean equalTo(Test o) {
        if (o.a == a && o.b == b) {
            return true;
        } else {
            return false;
        }
    }
}
