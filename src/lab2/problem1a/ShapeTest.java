package lab2.problem1a;

public class ShapeTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        cylinder.setHeight(5);
        cylinder.setRadius(3);
        System.out.println(cylinder);

        Sphere sphere = new Sphere(5);
        System.out.println(sphere.volume() + "\n");

        Cube cube = new Cube(5);
        System.out.println(cube);
    }
}
