package lab3.problem1;

// we can extend only one abstract class, but many interfaces
public class Spider extends Animal implements Movable, Touchable {
    boolean isAggressive;
    int mass;

    public Spider (int age, String name, boolean isAggressive, int mass) {
        super(age, name);
        this.isAggressive = isAggressive;
        this.mass = mass;
    }

    @Override
    public void makeNoise() {
        System.out.println("zvuk pauka");
    }

    @Override
    public double calculateSpeed() {
        return 0;
    }

    @Override
    public void onTouch() {
        bite();
    }

    void bite() {
        //TODO
    }

    @Override
    public String toString() {
        return super.toString() + " , aggressive: " + isAggressive + " , mass: " + mass;
    }
}
