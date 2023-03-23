package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Airbus", 1998, 25, 80000);
        Airplane airplane2 = new Airplane("Boeing", 2004, 40, 40000);
        Airplane.compareAirplanes(airplane1, airplane2);
    }
}