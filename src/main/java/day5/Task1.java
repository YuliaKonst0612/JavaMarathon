package day5;

public class Task1 {
    public static void main(String[] args) {
Car car = new Car();
car.setName("BMW");
car.setColor("black");
car.setYear(1985);
        System.out.println(car.getName());
        System.out.println(car.getColor());
        System.out.println(car.getYear());

    }
}

class Car {
    private String name;
    private String color;
    private int year;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
       this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
       this.year = year;
    }
}