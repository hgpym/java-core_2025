//
//Создайте класс Rectangle, который содержит поля для длины и
//ширины прямоугольника.
//
//Добавьте методы, которые позволяют установить и получить
//значения этих полей.
//
//Добавьте методы, которые позволяют вычислить площадь и
//периметр прямоугольника.
//
//Добавьте конструктор, который позволяет создавать объекты
//класса Rectangle, используя значения для длины и ширины.

package lr2.Example7;

public class ExampleMain {
    public static void main(String[] args) {

        Rectangle rectangleWaste = new Rectangle();
        System.out.println("Периметр rectangleWaste = " + rectangleWaste.calculatePerimeter());

        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("Периметр rectangle = " + rectangle.calculatePerimeter());
        System.out.println("Площадь rectangle = " + rectangle.calculateSquare());
    }
}
