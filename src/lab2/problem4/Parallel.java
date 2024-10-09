package lab2.problem4;

public class Parallel extends Circuit {
    Circuit nodeFirst;
    Circuit nodeSecond;
    double totalResistance;
    double totalDifference;

    public Parallel(Circuit first, Circuit second) {
        this.nodeFirst = first;
        this.nodeSecond = second;
    }

    @Override
    public double getResistance() {
        double firstResistance = nodeFirst.getResistance();
        double secondResistance = nodeSecond.getResistance();
        totalResistance =  firstResistance * secondResistance / (firstResistance + secondResistance);
        return totalResistance;
    }

    @Override
    public double getPotentialDiff() {
        totalDifference = nodeFirst.getPotentialDiff();
        return totalDifference;
    }

    @Override
    public void applyPotentialDiff(double V) {
        totalDifference = V;
    }
}
