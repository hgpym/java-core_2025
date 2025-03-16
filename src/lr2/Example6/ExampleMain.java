//Создание класса "Человек":
//1.Создайте класс Person, который содержит поля для имени,
//возраста и пола человека.
//2.Добавьте методы, которые позволяют установить и получить
//значения этих полей.
//3.Добавьте конструктор, который позволяет создавать объекты
//класса Person, используя значения для имени, возраста и пола.

package lr2.Example6;

public class ExampleMain {
    public static void main(String[] args) {
        Person unknown = new Person();
        unknown.setAge(20);
        unknown.setGender("женский");
        unknown.displayInfo();

        Person Max = new Person("Max", 23, "мужской");
        Max.displayInfo();
    }
}
