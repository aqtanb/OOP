package lab2.problem2;

public abstract class Piece {
    Position start;
    public Piece(Position start) {
        this.start = start;
    }
    public abstract boolean isLegalMove(Position end);
}
