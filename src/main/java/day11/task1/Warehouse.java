package day11.task1;

public class Warehouse {
    private int countDeliveredOrders;
    private int countPickedOrders;

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    public void incrementCountPickedOrders() {
        countPickedOrders += 1;
    }

    public void incrementCountDeliveredOrders() { countDeliveredOrders += 1; }

    @Override
    public String toString() {
        return "Warehouse{" +
                "countPickedOrders=" + countPickedOrders +
                ", countDeliveredOrders=" + countDeliveredOrders +
                '}';
    }
}
