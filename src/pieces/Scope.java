package src.pieces;

import src.Board;
import src.Coordinate;
import src.Move;
import src.Team;

public class Scope {

    private static boolean isPieceInPathLinear(Board board, Move move, Piece movingPiece, int fileChange,
            int rankChange) {
        int file = move.getFromFile();
        int rank = move.getFromRank();
        while (true) {
            Coordinate path = Coordinate.make(file += fileChange, rank += rankChange);
            System.out.println(path);
            if (path == null) {
                return false;
            }
            if (path.equals(move.getTo())) {
                return true;
            }
            Piece stationaryPiece = board.getPiece(path);
            if (stationaryPiece == null) {
                continue;
            } else {
                return movingPiece.getTeam() != stationaryPiece.getTeam();
            }
        }
    }

    public static boolean isMovePseudoLegalLinear(Board board, Move move, Piece movingPiece, int fileChange,
            int rankChange) {
        if (move.getFromFile() == move.getToFile() || move.getFromRank() == move.getToRank()) {
            return isPieceInPathLinear(board, move, movingPiece, fileChange, rankChange);
        }
        return false;
    }

    public static void main(String[] args) {
        Board board = new Board();
        Coordinate from = Coordinate.make(0, 0);
        Coordinate to = Coordinate.make(7, 0);
        Move move = new Move(from, to, null);
        Piece bishop = new Bishop(Team.WHITE);
        board.addPiece(Coordinate.make(4, 0), new Bishop(Team.WHITE));
        boolean result = isPieceInPathLinear(board, move, bishop, 1, 0);
        System.out.println(result);
    }

}
