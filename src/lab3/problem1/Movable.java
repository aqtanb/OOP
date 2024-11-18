package lab3.problem1;

public interface Movable {
    // we have to initialize fields, fields belong to interface

    static public double gravity = 9.8;

    double calculateSpeed();

    default double calculateSpeedWithGravity(double time) {
        return gravity * time;
    }
    // abstract classes can have default methods, that have impl to reduce boilerplate code
    // but other methods are abstract and cant have impl
}
