package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.info();
        car.setYear(2018);
        System.out.println(car.yearDifference(2020));

        Motorbike bike = new Motorbike(2019, "Red", "HondaCBR");
        bike.info();
        System.out.println(bike.yearDifference(2020));
    }
}
