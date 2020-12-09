package day9.Task2;

public class TestFigures {
    public static void main(String[] args) {
        Figure[] figures = {
                new Triangle("Red", 10, 10, 10),
                new Triangle("Green", 20, 30, 10),
                new Triangle("Red", 20, 15, 10),
                new Rectangle("Red", 10, 5),
                new Rectangle("Orange", 15, 40),
                new Circle("Red", 4),
                new Circle("Red", 10),
                new Circle("Blue", 5)
        };
        calculateRedPerimeter(figures);
        calculateRedArea(figures);
    }
    public static double calculateRedPerimeter(Figure[] figures) {
        double sumPerimeters = 0;
        for (Figure figure: figures) {
            if (figure.color.equals("Red")) sumPerimeters += figure.perimeter();
        }
        System.out.println(sumPerimeters);
        return sumPerimeters;

    }
    public static double calculateRedArea(Figure[] figures) {
        double sumAreas = 0;
        for (Figure figure: figures) {
            if (figure.color.equals("Red")) sumAreas += figure.area();
        }
        System.out.println(sumAreas);
        return sumAreas;
    }
}
