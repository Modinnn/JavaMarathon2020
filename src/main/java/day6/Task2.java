package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane plane = new Airplane("Airbus", 2018, 60,50);
        plane.setYear(2015);
        plane.setLength(70);
        plane.fillUp(10);
        plane.fillUp(15);
        plane.info();
    }
}
