package chapter6;

public class BoxDemo5 {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();
        double vol;

        myBox1.setDim(14,36,45);
        myBox2.setDim(12,6,5);

        vol = myBox1.volume1();
        System.out.println("Volume is: " + vol);

        vol = myBox2.volume1();
        System.out.println("Volume is: " + vol);
    }

}
