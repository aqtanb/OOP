package lab2.problem4;

public class Parallel extends Circuit {
    Circuit nodeFirst;
    Circuit nodeSecond;

    public Parallel(Circuit first, Circuit second) {
        this.nodeFirst = first;
        this.nodeSecond = second;
    }

    @Override
    public double getResistance() {
        return 1 / (1 / nodeFirst.getResistance() + 1 / nodeSecond.getResistance());
    }

    @Override
    public double getPotentialDiff() {
        return nodeFirst.getPotentialDiff();
    }

    @Override
    public void applyPotentialDiff(double V) {
        nodeFirst.applyPotentialDiff(V);
        nodeSecond.applyPotentialDiff(V);
    }
}
