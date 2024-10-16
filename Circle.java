package UJIAN;

public class Circle extends Shape {
    private int radius;

    public Circle(String name, String color, int radius) {
        super(name, color);
        this.radius = radius;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Radius: " + radius);
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
