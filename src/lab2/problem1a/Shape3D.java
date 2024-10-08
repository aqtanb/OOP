package lab2.problem1a;

public abstract class Shape3D {
    public abstract double volume();
    public abstract double surfaceArea();

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "\n" + "Volume: " + this.volume() + "\n" + "Area: " + this.surfaceArea() + "\n";
    }
}