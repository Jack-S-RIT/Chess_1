package src.pieces;

import java.util.HashMap;

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
     * @return returns a String with a single letter
     */
    public String symbol() {
        return name.charAt(0) + "";
    }

    public abstract boolean isMovePseudoLegal(Coordinate from, Coordinate to, HashMap<Coordinate, Piece> board);

    public abstract boolean isCoordinateDefended(Coordinate position, Coordinate to, HashMap<Coordinate, Piece> board);

    @Override
    public String toString() {
        return team + " " + name;
    }
    
}
