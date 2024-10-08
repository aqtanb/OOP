package lab2.problem2;

public class Pawn extends Piece {
    public Pawn(Position start) {
        super(start);
    }
    @Override
    public boolean isLegalMove(Position end) {
        if (start.getVertical() == 'B' && (end.getVertical() == 'D' || end.getVertical() == 'C')) {
            return true;
        } else if (start.getHorizontal() == end.getHorizontal() && start.getVertical() + 1 == end.getVertical()) {
            return true;
        } else {
            return false;
        }
    }
}
