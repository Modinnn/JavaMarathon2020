package day9.Task2;

public class Rectangle extends Figure {

    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double area() {
        return getWidth() * getHeight();
    }

    @Override
    public double perimeter() {
        return (getWidth() + getHeight()) * 2;
    }
}
