package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike  motorbike = new  Motorbike("Harley", "red", 1968);
        System.out.println(motorbike.getName());
        System.out.println(motorbike.getColor());
        System.out.println(motorbike.getYear());

    }
}

class Motorbike {
    private String name;
    private String color;
    private int year;

    public Motorbike(String name, String color, int year) {
        this.name = name;
        this.color = color;
        this.year = year;
    }

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


