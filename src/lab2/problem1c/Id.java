package lab2.problem1c;

import java.util.Objects;

public class Id extends Card {
    private int dd;

    public Id(int DD) {
        this.dd = DD;
    }

    public Id() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Id other)) return false;
        return Objects.equals(dd, other.dd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.getColor(), super.getExpireDate(), dd);
    }

    @Override
    public String toString() {
        return "DD: " + dd;
    }
}
