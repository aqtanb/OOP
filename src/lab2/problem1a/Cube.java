package lab2.problem1a;

public class Cube extends Shape3D {
    private double side;
    public Cube(double s) {
        this.side = s;
    }
    public Cube() {}
    @Override
    public double volume() {
        return side * side * side;
    }

    @Override
    public double surfaceArea() {
        return 6 * side * side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}