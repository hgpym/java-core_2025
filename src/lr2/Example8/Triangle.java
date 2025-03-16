package lr2.Example8;

public class Triangle implements Shape {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle() {
        this(1, 1, 1);
    }

    public Triangle(double sideA, double sideB, double sideC) {
        setSideA(sideA);
        setSideB(sideB);
        setSideC(sideC);
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        if (sideA <= 0) {
            throw new IllegalArgumentException("Нельзя ввести отрицательное число или 0!!!");
        }
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        if (sideB <= 0) {
            throw new IllegalArgumentException("Нельзя ввести отрицательное число или 0!!!");
        }
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        if (sideC <= 0) {
            throw new IllegalArgumentException("Нельзя ввести отрицательное число или 0!!!");
        }
        this.sideC = sideC;
    }

    @Override
    public double calculateArea() {
        double p = (sideA + sideB + sideC) / 2;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }
}
