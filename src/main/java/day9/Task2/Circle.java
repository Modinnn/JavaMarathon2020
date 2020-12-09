package day9.Task2;

public class Circle extends Figure{

    double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double area() {
        return 3.1415 * getRadius() * getRadius();
    }

    @Override
    public double perimeter() {
        return 2 * 3.1415 * getRadius();
    }
}
