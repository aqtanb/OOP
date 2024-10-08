package lab2.problem2;

public class King extends Piece {
    public King(Position start) {
        super(start);
    }
    @Override
    public boolean isLegalMove(Position end) {
        if (Math.abs(start.getVertical() - end.getVertical()) <= 1 && Math.abs(start.getHorizontal() - end.getHorizontal()) <= 1) {
            return true;
        } else {
            return false;
        }
    }
}
