package day6;


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
    void info(){
        System.out.println("Это мотоцикл");
    }
    void yearDifference(){
        int yearsInput = 2023 - year;
        System.out.println(yearsInput);
    }
}


