package day9.Task2;

public class Triangle extends Figure {
    private double sideLength1;
    private double sideLength2;
    private double sideLength3;

    public Triangle(String color, double sideLength1, double sideLength2, double sideLength3) {
        super(color);
        this.sideLength1 = sideLength1;
        this.sideLength2 = sideLength2;
        this.sideLength3 = sideLength3;
    }

    @Override
    public double area() {
        double halfP = perimeter() / 2;
        return Math.sqrt(halfP * (halfP - sideLength1) * (halfP - sideLength2) * (halfP - sideLength3));
    }

    @Override
    public double perimeter() {
        return sideLength1 + sideLength2 + sideLength3;
    }
}
