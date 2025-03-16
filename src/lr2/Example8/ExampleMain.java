package lr2.Example8;

public class ExampleMain {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Square square = new Square(5);
        Triangle triangle = new Triangle(5, 5, 5);

        System.out.println("Круг:");
        System.out.println("Площадь: " + circle.calculateArea());
        System.out.println("Периметр: " + circle.calculatePerimeter());

        System.out.println("\nКвадрат:");
        System.out.println("Площадь: " + square.calculateArea());
        System.out.println("Периметр: " + square.calculatePerimeter());

        System.out.println("\nТреугольник:");
        System.out.println("Площадь: " + triangle.calculateArea());
        System.out.println("Периметр: " + triangle.calculatePerimeter());
    }
}
