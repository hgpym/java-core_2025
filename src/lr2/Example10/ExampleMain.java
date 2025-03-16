package lr2.Example10;

public class ExampleMain {
    public static void main(String[] args) {
        checkAnimal();
        checkShape();
    }

    public static void checkAnimal()
    {
        Animal dog = new Dog("Мухтар", 5, "Овчарка");
        Animal cat = new Cat("Берлинго", 3, "Рыба");
        Animal penguin = new Bird("Пингвин", 2, false);
        Animal golub = new Bird("Голубь", 1, true);

        dog.makeSound();
        ((Dog)dog).pretendToBeDead();

        cat.makeSound();
        ((Cat)cat).startPurring();

        penguin.makeSound();
        ((Bird) penguin).fly();

        golub.makeSound();
        ((Bird) golub).fly();
    }

    public static void checkShape()
    {
        Shape circle = new Circle(5);
        Shape square = new Square(5);
        Shape triangle = new Triangle(5, 5, 5);

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
