package UJIAN;

public class Shape {
    private String name;
    private String color;

    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Color: " + color);
    }

    public double area() {
        return 0; // Default area for shape (can be overridden)
    }
}
