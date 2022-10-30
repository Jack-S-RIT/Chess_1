package src;

import java.util.HashMap;

import src.pieces.Piece;

public class Board {

    private HashMap<Coordinate, Piece> coordToPiece;


    public Board() {
        coordToPiece = new HashMap<>();
    }

    public HashMap<Coordinate, Piece> getCoordToPiece() {
        return coordToPiece;
    }
    
}
