package day9.Task2;

public class Triangle extends Figure {

    private double lengthSide1;
    private double lengthSide2;
    private double lengthSide3;

    public Triangle(String color, double lengthSide1, double lengthSide2, double lengthSide3) {
        super(color);
        this.lengthSide1 = lengthSide1;
        this.lengthSide2 = lengthSide2;
        this.lengthSide3 = lengthSide3;
    }

    public double getLengthSide1() {
        return lengthSide1;
    }

    public double getLengthSide2() {
        return lengthSide2;
    }

    public double getLengthSide3() {
        return lengthSide3;
    }

    @Override
    public double area() {
        double p = perimeter() / 2;
        return Math.sqrt(p * (p - getLengthSide1()) * (p - getLengthSide2()) * (p - getLengthSide3()));
    }

    @Override
    public double perimeter() {
        return getLengthSide1() + getLengthSide2() + getLengthSide3();
    }
}
