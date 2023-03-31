package day11.task1;

public class Courier implements Worker {
    protected int salary;
    protected boolean isPaid;
    private static final int PAYMENT = 100;
    private Warehouse wh;
    public Courier(int salary, boolean isPaid) {
        this.salary = salary;
        this.isPaid = isPaid;
    }

    public Courier(Warehouse wh) {
        this.wh = wh;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public boolean getIsPaid() {
        return isPaid;
    }

    public void setIsPaid(boolean isPaid) {
        this.isPaid = isPaid;
    }

    @Override
    public void doWork() {
        salary += PAYMENT;
       // System.out.println(salary);

        wh.ordersDeliveredPlus();;
    }



    @Override
    public void bonus() {
        if (wh.getCountDeliveredOrders() < 10000) {
            System.out.println("Бонус пока не доступен");
return;
        }
        if (isPaid) {
            System.out.println("Бонус уже был выплачен");
            return;
        }
            salary += 50000;
        isPaid=true;
        }



    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                ", isPaid=" + isPaid +
                '}';
    }
}
