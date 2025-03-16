package lr2.Example7;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle() {
        this(1, 1);
    }

    public Rectangle(double width, double height) {
        setWidth(width);
        setHeight(height);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double calculateSquare()
    {
        return width * height;
    }

    public double calculatePerimeter()
    {
        return  width * 2 + height * 2;
    }
}
