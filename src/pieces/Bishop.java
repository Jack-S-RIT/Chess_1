package src.pieces;

import src.Board;
import src.Coordinate;
import src.Team;

public class Bishop extends Piece {

    public Bishop(Team team) {
        super(team, "Bishop", 3);
    }

    @Override
    public boolean isMovePseudoLegal(Coordinate from, Coordinate to, Board board) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isCoordinateDefended(Coordinate position, Coordinate defended, Board board) {
        // TODO Auto-generated method stub
        return false;
    }

}
