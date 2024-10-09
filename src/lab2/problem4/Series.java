package lab2.problem4;

public class Series extends Circuit {
    Circuit nodeFirst;
    Circuit nodeSecond;
    double totalResistance;
    double totalDifference;

    public Series(Circuit first, Circuit second) {
        this.nodeFirst = first;
        this.nodeSecond = second;
    }

    @Override
    public double getResistance() {
        double firstResistance = nodeFirst.getResistance();
        double secondResistance = nodeSecond.getResistance();
        totalResistance =  firstResistance + secondResistance;
        return totalResistance;
    }

    @Override
    public double getPotentialDiff() {
        double firstDifference = nodeFirst.getPotentialDiff();
        double secondDifference = nodeSecond.getPotentialDiff();
        totalDifference = nodeFirst.getPotentialDiff() + nodeSecond.getPotentialDiff();
        return totalDifference;
    }

    @Override
    public void applyPotentialDiff(double V) {
        totalDifference = V;
    }
}
