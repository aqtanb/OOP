package lab2.problem2;

public class ChessTest {
    public static void main(String[] args) {
        Position start = new Position('A', 1);
        Rook rook = new Rook(start);
        Position end = new Position('B', 2);
        King king = new King(start);
        Queen queen = new Queen(start);
        Bishop bishop = new Bishop(start);
        Knight knight = new Knight(start);
        Pawn pawn = new Pawn(start);
        System.out.println(rook.isLegalMove(end));
        System.out.println(king.isLegalMove(end));
        System.out.println(queen.isLegalMove(end));
        System.out.println(bishop.isLegalMove(end));
        System.out.println(knight.isLegalMove(end));
        System.out.println(pawn.isLegalMove(end));

    }

}
