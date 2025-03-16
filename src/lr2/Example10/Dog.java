package lr2.Example10;

public class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        setBreed(breed);
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Звук собаки: гав-гав-гав!!!");
    }

    public void pretendToBeDead() {
        System.out.println("Собака притворилась мертвой");
    }
}
