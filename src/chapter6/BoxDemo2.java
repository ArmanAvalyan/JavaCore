package chapter6;

public class BoxDemo2 {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();
        double vol;

        myBox1.width = 15;
        myBox1.height = 25;
        myBox1.depth = 35;

        myBox2.width = 5;
        myBox2.height = 55;
        myBox2.depth = 3;

        vol = myBox1.width * myBox1.height * myBox1.depth;
        System.out.println("Volume is: " + vol);
        vol = myBox2.width * myBox2.height * myBox2.depth;
        System.out.println("Volume is: " + vol);
    }
}
