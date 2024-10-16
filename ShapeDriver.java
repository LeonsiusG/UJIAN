package UJIAN;

import java.util.Scanner;

public class ShapeDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //inputan untuk rectangle
        System.out.print("Enter Rectangle name: ");
        String rectName = scanner.nextLine();
        System.out.print("Enter Rectangle color: ");
        String rectColor = scanner.nextLine();
        int rectLength = getPositiveInt(scanner, "Enter Rectangle length: ");
        int rectWidth = getPositiveInt(scanner, "Enter Rectangle width: ");
        Rectangle rectangle = new Rectangle(rectName, rectColor, rectLength, rectWidth);

        //inputan untuk circle
        scanner.nextLine(); 
        System.out.print("Enter Circle name: ");
        String circleName = scanner.nextLine();
        System.out.print("Enter Circle color: ");
        String circleColor = scanner.nextLine();
        int circleRadius = getPositiveInt(scanner, "Enter Circle radius: ");
        Circle circle = new Circle(circleName, circleColor, circleRadius);

        //inputan untuk cube
        scanner.nextLine(); 
        System.out.print("Enter Cube name: ");
        String cubeName = scanner.nextLine();
        System.out.print("Enter Cube color: ");
        String cubeColor = scanner.nextLine();
        int cubeHeight = getPositiveInt(scanner, "Enter Cube height: ");
        Cube cube = new Cube(cubeName, cubeColor, cubeHeight);

        System.out.println("\nShape Information and Areas:");
        rectangle.print();
        System.out.println("Area: " + rectangle.area());
        circle.print();
        System.out.println("Area: " + circle.area());
        cube.print();
        System.out.println("Surface Area: " + cube.area());

        scanner.close();
    }

    private static int getPositiveInt(Scanner scanner, String prompt) {
        int value;
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
                if (value > 0) {
                    scanner.nextLine(); 
                    return value;
                } else {
                    System.out.println("Please enter a positive number.");
                }
            } else {
                System.out.println("Invalid input. Please enter a positive integer.");
                scanner.next(); // Clear the invalid input
            }
        }
    }
}
