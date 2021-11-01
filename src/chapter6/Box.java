package chapter6;

public class Box {
    double width;
    double height;
    double depth;

    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    Box() {
    }

    void volume() {
        System.out.print("Volume is: ");
        System.out.println(width * height * depth);
    }

    double volume1() {
        return width * height * depth;
    }

    void setDim(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
}
