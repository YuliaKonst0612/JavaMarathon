package day6;

public class Task2 {
    public static void main(String[] args) {
Airplane airplane = new Airplane("Airbus" , 1998, 50, 80000);
airplane.setYear(2002);
airplane.setLength(60);
airplane.fillup(2000);
airplane.fillup(5000);
airplane.info();
    }
}
