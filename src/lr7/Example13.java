//Сохранение объекта класса в файл и восстановление его из файла,
//требуется создать класс с несколькими полями и реализовать
//интерфейс Serializable. Затем создать объект этого класса, записать
//его в файл в бинарном виде с помощью ObjectOutputStream, а затем
//восстановить его из файла с помощью ObjectInputStream. После
//восстановления объекта из файла необходимо вывести значения его
//полей на экран.

package lr7;

import java.io.*;

class PersonNew implements Serializable {
    private String name;
    private int age;

    public PersonNew(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Example13 {
    public static void main(String[] args) {
        String filename = "src/lr7/personNew.ser";

        PersonNew person = new PersonNew("Макс", 23);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(person);
            System.out.println("Объект успешно записан в файл.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            PersonNew restoredPerson = (PersonNew) ois.readObject();

            System.out.println("Объект восстановлен из файла:");
            System.out.println("Имя: " + restoredPerson.getName());
            System.out.println("Возраст: " + restoredPerson.getAge());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
