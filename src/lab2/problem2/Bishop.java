package lab2.problem2;

public class Bishop extends Piece {
    public Bishop(Position start) {
        super(start);
    }
    @Override
    public boolean isLegalMove(Position end) {
        if (Math.abs(start.getHorizontal() - end.getHorizontal()) == Math.abs(start.getVertical() - end.getVertical())) {
            return true;
        } else {
            return false;
        }
    }
}
