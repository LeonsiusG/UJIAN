package UJIAN;

public class Rectangle extends Shape {
    private int length;
    private int width;

    public Rectangle(String name, String color, int length, int width) {
        super(name, color);
        this.length = length;
        this.width = width;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
    }

    @Override
    public double area() {
        return length * width;
    }
}
