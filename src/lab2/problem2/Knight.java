package lab2.problem2;

public class Knight extends Piece {
    public Knight(Position start) {
        super(start);
    }
    @Override
    public boolean isLegalMove(Position end) {
        if (Math.abs(start.getHorizontal() - end.getHorizontal()) == 2 && Math.abs(start.getVertical() - end.getVertical()) == 1) return true;
        if (Math.abs(start.getHorizontal() - end.getHorizontal()) == 1 && Math.abs(start.getVertical() - end.getVertical()) == 2) return true;
        return false;
    }
}
