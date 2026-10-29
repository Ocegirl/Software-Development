import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first side: ");
        double side1 = scanner.nextDouble();
        System.out.print("Enter second side: ");
        double side2 = scanner.nextDouble();
        System.out.print("Enter third side: ");
        double side3 = scanner.nextDouble();
        System.out.print("Enter a color: ");
        String color = scanner.next();
        System.out.print("Is it filled?: ");
        boolean filled = scanner.nextBoolean();
        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);
        triangle.setFilled(filled);
        System.out.println("Area: " + triangle.getArea() + " Perimeter: " + triangle.getPerimeter() + " Color: " + triangle.getColor() + " Date created: " + triangle.getDateCreated() + " Filled: " + triangle.isFilled());
        scanner.close();
    }
}
