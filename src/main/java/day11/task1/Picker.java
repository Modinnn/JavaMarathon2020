package day11.task1;

public class Picker implements Worker {
    private double salary = 0;
    private boolean isPayed;
    private Warehouse warehouse;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public double getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }

    @Override
    public void doWork() {
        salary += 80;
        warehouse.setCountPickedOrders();
        if (warehouse.getCountPickedOrders() == 10000) {
            bonus();
        }
    }

    @Override
    public void bonus() {
        if (isPayed) {
            System.out.println("Бонус уже был выплачен");
        } else {
            if (warehouse.getCountPickedOrders() < 10000) {
                System.out.println("Бонус пока не доступен");
            } else {
                salary += 70000;
                isPayed = true;
            }
        }
    }
}
