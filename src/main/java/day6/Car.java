package day6;

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

    void info() {
        System.out.println("Это автомобиль");
    }

    int yearDifference(int inputYear) {
      int year = inputYear;
      int yearDiff  = 2023-inputYear;
     return yearDiff;
    }
}

