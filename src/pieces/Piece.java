package src.pieces;

import src.Board;
import src.Coordinate;
import src.Team;

/**
 * abstract class that represents a Piece in chess
 */
public abstract class Piece {

    /**
     * represents what team the piece is on
     */
    private Team team;

    /**
     * the name of the piece
     */
    private String name;

    /**
     * represents how many points is it worth when captured
     */
    private int value;

    public Piece(Team team, String name, int value) {
        this.team = team;
        this.name = name;
        this.value = value;
    }

    public Team getTeam() {
        return team;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    /**
     * the pieces representation in the CLI a single letter String
     * 
     * @return returns a String with a single letter
     */
    public String symbol() {
        return name.charAt(0) + "";
    }

    /**
     * determines if a move is pseudo legal given the location of the piece, where
     * it is moving to, and the state of the board
     * 
     * @param from  passes in a coordinate for where the piece is located at
     * @param to    passes in a coordinate for where the piece is moving to
     * @param board passes in a hashmap with all the information about other
     *              piece locations
     * @return returns true if the piece is allowed to move to the square pseudo
     *         legally and false other wise
     */
    public abstract boolean isMovePseudoLegal(Coordinate from, Coordinate to, Board board);

    /**
     * determines if a coordinate is defended given the location of the piece, which
     * coordinate you are checking is defended, and the state of the board
     * 
     * @param position passes in a coordinate as the position of the piece
     * @param defended passes in which coordinate you are checking if its defended
     * @param board    passes in a hashmap with all the information about other
     *                 piece locations
     * @return
     */
    public abstract boolean isCoordinateDefended(Coordinate position, Coordinate defended, Board board);

    @Override
    public String toString() {
        return team + " " + name;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Piece) {
            Piece other = (Piece) o;
            return this.team == other.team && this.name.equals(other.name);
        }
        return false;
    }

}
