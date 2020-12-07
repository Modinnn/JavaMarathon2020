package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Boeing", 2015, 60, 100);
        Airplane airplane2 = new Airplane("Airbus", 2016, 70, 100);
        Airplane.compareAirplanes(airplane1, airplane2);

    }
}