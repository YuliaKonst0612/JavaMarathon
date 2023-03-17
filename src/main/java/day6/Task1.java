package day6;

public class Task1 {
    public static void main(String[] args) {
Car car = new Car();
Motorbike motorbike = new Motorbike("k", "j",2010);
car.info();
int year1 = car.yearDifference(2010);
System.out.println(year1);
motorbike.info();
motorbike.yearDifference();

    }

}