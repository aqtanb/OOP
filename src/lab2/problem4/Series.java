package lab2.problem4;

public class Series extends Circuit {
    Circuit nodeFirst;
    Circuit nodeSecond;

    public Series(Circuit first, Circuit second) {
        this.nodeFirst = first;
        this.nodeSecond = second;
    }

    @Override
    public double getResistance() {
        return nodeFirst.getResistance() + nodeSecond.getResistance();
    }

    @Override
    public double getPotentialDiff() {
        return nodeFirst.getPotentialDiff() + nodeSecond.getPotentialDiff();
    }

    @Override
    public void applyPotentialDiff(double V) {

        nodeFirst.applyPotentialDiff(V * (nodeFirst.getResistance() / getResistance()));
        nodeSecond.applyPotentialDiff(V * (nodeSecond.getResistance() / getResistance()));
    }
}
