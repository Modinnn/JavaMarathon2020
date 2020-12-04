package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYear(2020);
        car.setColor("Yellow");
        car.setModel("Aventador SVJ Roadster");
        System.out.println(car.getYear());
        System.out.println(car.getColor());
        System.out.println(car.getModel());
    }
}
