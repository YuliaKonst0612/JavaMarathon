package day9.Task2;

public class Rectangle extends Figure {
    private double width;
    private double hight;

    public Rectangle(String color, double width, double hight) {
        super(color);
        this.hight = hight;
        this.width = width;
    }

    @Override
    public double area() {
        return width * hight;
    }

    @Override
    public double perimeter() {
        return 2 * (hight + width);
    }
}
