package chapter6;

public class BoxDemo3 {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();

        myBox1.width = 14;
        myBox1.height = 32;
        myBox1.depth = 7;

        myBox2.width = 17;
        myBox2.height = 42;
        myBox2.depth = 37;

        myBox1.volume();
        myBox2.volume();
    }
}
