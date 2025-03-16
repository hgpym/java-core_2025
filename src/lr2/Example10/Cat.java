package lr2.Example10;

public class Cat extends Animal{
    private String foodType;

    public Cat(String name, int age, String foodType) {
        super(name, age);
        this.foodType = foodType;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    @Override
    public void makeSound() {
        System.out.println("Звук кошки: мяяяуууу!!!");
    }

    public void startPurring() {
        System.out.println("Кошка мурлычет");
    }
}
