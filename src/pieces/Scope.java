package src.pieces;

import src.Board;
import src.Coordinate;
import src.Move;
import src.Team;

public class Scope {

    public static boolean isFromInScopeOfTo(Board board, Move move, Piece movingPiece, int fileChange, int rankChange) {
        Coordinate alongpath = Coordinate.make(move.getFromFile() + fileChange, move.getFromRank() + rankChange);
        if (alongpath == null) {
            return false;
        } else {
            Piece stationaryPiece = board.getPiece(alongpath);
            if (stationaryPiece == null) {
                if (alongpath.equals(move.getTo())) {
                    return true;
                } else {
                    move.setFrom(alongpath);
                    return isFromInScopeOfTo(board, move, movingPiece, fileChange, rankChange);
                }
            } else {
                return movingPiece.getTeam() != stationaryPiece.getTeam();
            }
        }
    }

    // public static void main(String[] args) {
    //     Board board = new Board();
    //     Move move = new Move(Coordinate.make(0, 0), Coordinate.make(7, 7), Move.MoveType.NORMAL);
    //     Piece piece = new Bishop(Team.BLACK);
    //     board.addPiece(Coordinate.make(4, 4), Team.B);
    //     System.out.println(isFromInScopeOfTo(board, move, piece, 1, 1));
    // }

}
