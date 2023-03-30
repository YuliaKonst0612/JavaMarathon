package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        cars.add(0, "Toyota");
        cars.add(1, "BMW");
        cars.add(2, "Mercedes");
        cars.add(3, "Opel");
        cars.add(4, "Ford");
        System.out.println(cars);
        cars.remove(0);
        System.out.println(cars);
        cars.add(2, "Lada");
        System.out.println(cars);
    }

}