package day7;

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void info() {
        System.out.print("Изготовитель: " + producer + ", ");
        System.out.print("год выпуска: " + year + ", ");
        System.out.print("длина: " + length + ", ");
        System.out.print("вес: " + weight + ", ");
        System.out.print("количество топлива в баке: " + fuel + ".");
    }

    public void fillUp(int filledVolume) {
        fuel += filledVolume;
    }

    public static void compareAirplanes(Airplane a, Airplane b) {
        if (a.length > b.length) {
            System.out.print(a.producer + " длиннее");
        }
        else if (a.length < b.length) {
            System.out.print(b.producer + " длиннее");
        } else {
            System.out.println("Длины самолетов равны");
        }
    }
}
