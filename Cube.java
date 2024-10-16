package UJIAN;

public class Cube extends Shape {
    private int height;

    public Cube(String name, String color, int height) {
        super(name, color);
        this.height = height;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Height: " + height);
    }

    @Override
    public double area() {
        return 6 * (height * height); // Surface area of a cube
    }
}
