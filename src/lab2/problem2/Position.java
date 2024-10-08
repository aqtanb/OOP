package lab2.problem2;

public class Position {
    private char horizontal;
    private int vertical;
    public Position(char x, int y) {
        if (x >= 'A' && x <= 'H') {
            this.horizontal = x;
        } else {
            throw new IllegalArgumentException("Invalid Position");
        }
        if (y >= 1 && y <= 8) {
            this.vertical = y;
        } else {
            throw new IllegalArgumentException("Invalid Position");
        }
    }
    Position() {}

    public char getHorizontal() {
        return horizontal;
    }

    public int getVertical() {
        return vertical;
    }
}
