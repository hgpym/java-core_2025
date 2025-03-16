package lr2.Example10;

public class Bird extends Animal {
    private boolean canFly;

    public Bird(String name, int age, boolean canFly) {
        super(name, age);
        this.canFly = canFly;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    @Override
    public void makeSound() {
        System.out.println("Звук птицы: чирик-чирик!!!");
    }

    public void fly() {
        if (canFly) {
            System.out.println("Птица полетела");
        } else {
            System.out.println("Птица не умеет летать!!!");
        }
    }
}
