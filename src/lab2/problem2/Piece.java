package lab2.problem2;

public abstract class Piece {
    Position start;
    public Piece(Position start) {
        this.start = start;
    }
    public abstract boolean isLegalMove(Position end);

    @Override
    public String toString() {
        return "Start position: " + start.getVertical() + ", " + start.getHorizontal();
    }
}
