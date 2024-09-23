package lab1.problem1;

public class Data {
    private double sum;
    private double maximum;
    private int count;
    Data() {
        sum = 0;
        maximum = Double.NEGATIVE_INFINITY;
        count = 0;
    }

    void add(int number) {
        sum += number;
        count++;

        if (number > maximum) {
            maximum = number;
        }
    }

    public double getMaximum() {
        return maximum;
    }

    public double getAverage() {
        return count == 0 ? 0 : sum / count;
    }
}
