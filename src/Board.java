package src;

import java.util.HashMap;

import src.pieces.Piece;

/**
 * class that represents the Board in chess
 * 
 * @author Jackson
 */
public class Board {

    /**
     * a hashmap which keeps track of all pieces and the coordinate they are at
     */
    private HashMap<Coordinate, Piece> coordToPiece;

    public Board() {
        coordToPiece = new HashMap<>();
    }

    public HashMap<Coordinate, Piece> getCoordToPiece() {
        return coordToPiece;
    }

    /**
     * gets the Piece at a given coordinate
     * 
     * @param coord passes in a Coordinate object
     * @return returns a Piece if a piece is located at the coordinate and null
     *         otherwise
     */
    public Piece getPiece(Coordinate coord) {
        return coordToPiece.get(coord);
    }

    public void addPiece(Coordinate coord, Piece piece) {
        coordToPiece.put(coord, piece);
    }

    /**
     * moves a piece from one coordinate to another
     * 
     * @param from passes in a coordinate for where the piece is located
     * @param to   passes in a coordinate for where the piece is going
     * @return returns the piece that was captured, null if no piece was captured
     */
    public Piece movePiece(Coordinate from, Coordinate to) {
        Piece movingPiece = getPiece(from);
        coordToPiece.remove(from, movingPiece);
        Piece capturedPiece = getPiece(to);
        coordToPiece.put(to, movingPiece);
        return capturedPiece;
    }

}
