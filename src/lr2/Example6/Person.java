package lr2.Example6;

public class Person {
    private String name;
    private int age;
    private String gender;

    public Person()
    {
        this("Unknown_Name", 0, "Unknown_Gender");
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void displayInfo() {
        System.out.printf("Имя: %s, Возраст: %d, Пол: %s\n", name, age, gender);
    }
}
