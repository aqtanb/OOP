package lab2.problem2;

public class Queen extends Piece {
    public Queen(Position start) {
        super(start);
    }
    @Override
    public boolean isLegalMove(Position end) {
        King king = new King(start);
        Rook rook = new Rook(start);
        Bishop bishop = new Bishop(start);
        if (king.isLegalMove(end) || rook.isLegalMove(end) || bishop.isLegalMove(end)) {
            return true;
        } else {
            return false;
        }
    }
}
