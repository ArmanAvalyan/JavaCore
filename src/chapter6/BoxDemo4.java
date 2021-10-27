package chapter6;

public class BoxDemo4 {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();
        double vol;

        myBox1.width = 10;
        myBox1.height = 15;
        myBox1.depth = 7;

        myBox2.width = 3;
        myBox2.height = 7;
        myBox2.depth = 14;

        vol = myBox1.volume1();
        System.out.println("Volume is: " + vol);

        vol = myBox2.volume1();
        System.out.println("Volume is: " + vol);
    }
}
