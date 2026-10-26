public class App {
    public static void main(String[] args) throws Exception {
        Rectangle rectangle1 = new Rectangle(4,40);
        Rectangle rectangle2 = new Rectangle(3.5,35.9);
        System.out.println("Rectangle 1: width: " + rectangle1.width + " height: " + rectangle1.height + " area: " + rectangle1.getArea() + " perimeter: " + rectangle1.getPerimeter());
        System.out.println("Rectangle 2: width: " + rectangle2.width + " height: " + rectangle2.height + " area: " + rectangle2.getArea() + " perimeter: " + rectangle2.getPerimeter());
    }
}
