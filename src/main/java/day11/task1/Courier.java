package day11.task1;

public class Courier implements Worker {
    private double salary = 0;
    private boolean isPayed;
    private Warehouse warehouse;

    public Courier(Warehouse warehouse) {
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
        return "Courier{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }

    @Override
    public void doWork() {
        salary += 100;
        warehouse.setCountDeliveredOrders();
        if (warehouse.getCountDeliveredOrders() == 10000) {
            bonus();
        }
    }

    @Override
    public void bonus() {
        if (isPayed) {
            System.out.println("Бонус уже был выплачен");
        } else {
            if (warehouse.getCountDeliveredOrders() < 10000) {
                System.out.println("Бонус пока не доступен");
            } else {
                salary += 50000;
                isPayed = true;
            }
        }
    }
}
