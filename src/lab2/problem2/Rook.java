package lab2.problem2;

public class Rook extends Piece {

    public Rook(Position start) {
        super(start);
    }

    @Override
    public boolean isLegalMove(Position end) {
        if (start.getVertical() == end.getVertical() && start.getHorizontal() != end.getHorizontal()) {
            return true;
        } else if (start.getHorizontal() == end.getHorizontal() && start.getVertical() != end.getHorizontal()) {
            return true;
        } else {
            return false;
        }
    }
}
