package day11.task1;

public class Picker implements Worker {
    protected int salary;
    protected boolean isPaid;
    private static final int PAYMENT = 80;
    private Warehouse wh;


    public Picker(Warehouse wh) {
        this.wh = wh;
    }

    public Picker(int salary, boolean isPaid) {
        this.salary = salary;
        this.isPaid = isPaid;
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
        //System.out.println(salary);

        wh.ordersPickedPlus();
    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                ", wh=" + wh +
                '}';
    }

    @Override
    public void bonus() {

        if (wh.getCountPickedOrders() < 10000) {
            System.out.println("Бонус пока не доступен");
return;
        }
        if (isPaid) {
            System.out.println("Бонус уже выплачен");
            return;
        }
            salary += 70000;
            isPaid=true;
        }


    }


