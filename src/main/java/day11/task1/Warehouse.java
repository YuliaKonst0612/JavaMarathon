package day11.task1;

public class Warehouse implements Worker{
    protected int countPickedOrders;
    protected int countDeliveredOrders;

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public void setCountPickedOrders(int countPickedOrders) {
        this.countPickedOrders = countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    public void setCountDeliveredOrders(int countDeliveredOrders) {
        this.countDeliveredOrders = countDeliveredOrders;
    }
public void ordersDeliveredPlus(){
        countDeliveredOrders++;
}
public void ordersPickedPlus(){
        countPickedOrders++;
}
    @Override
    public void doWork() {

    }

    @Override
    public void bonus() {

    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "countPickedOrders=" + countPickedOrders +
                ", countDeliveredOrders=" + countDeliveredOrders +
                '}';
    }
}
