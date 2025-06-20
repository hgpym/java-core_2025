//Сериализация в Java — это механизм преобразования объектов Java в
//последовательность байтов, которую можно сохранить на диске или передать по
//сети, а затем восстановить обратно в объект. Таким образом, сериализация
//позволяет сохранять состояние объекта и восстанавливать его позже, например,
//для сохранения данных между запусками программы или для передачи данных
//между разными процессами.
//Для сериализации объект должен реализовать интерфейс Serializable. После
//сериализации объекта, его можно сохранить в файл или передать по сети в виде
//массива байтов. Для десериализации объекта необходимо использовать метод
//ObjectInputStream.readObject(), который считывает байты и восстанавливает
//объект.
//Важно помнить, что при сериализации и десериализации могут возникнуть
//проблемы, связанные с версионностью классов, изменением полей объектов и
//другими факторами, которые могут привести к потере данных или ошибкам при
//восстановлении объекта. Поэтому важно тщательно планировать и обрабатывать
//сериализацию и десериализацию в своих приложениях.
//Простой пример сериализации объекта Person в Java

package lr7;

import java.io.*;

class Person implements Serializable {
    private String name;
    private int age;

    public Person(String name, int age) {
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

public class Example7 {
    public static void main(String[] args) {
        Person person = new Person("Max Shabashov", 23);

        try {
            FileOutputStream fileOut = new FileOutputStream("src/lr7/person.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(person);
            out.close();
            System.out.println("Serialized data is saved in person.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
