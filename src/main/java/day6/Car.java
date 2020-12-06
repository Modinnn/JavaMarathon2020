package day6;

public class Car {
    private int year;
    private String color;
    private String model;

    public void setYear(int yearManufactured) {
        year = yearManufactured;
    }
    public void setColor(String colorOfCar) {
        color = colorOfCar;
    }
    public void setModel(String modelOfCar) {
        model = modelOfCar;
    }
    public int getYear() {
        return year;
    }
    public String getColor() {
        return color;
    }
    public String getModel() {
        return model;
    }

    public void info() {
        System.out.println("Это автомобиль");
    }

    public int yearDifference(int yearReceived) {
        return yearReceived - year;
    }
}
