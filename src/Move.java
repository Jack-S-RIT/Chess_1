package src;

public class Move {

    public enum MoveType {
        NORMAL,
        CASTLE,
        EN_PASSANT
    }

    /**
     * a Coordinate object which represents where the piece started from
     */
    private Coordinate from;

    /**
     * a Coordinate object which represents the piece's destination
     */
    private Coordinate to;

    /**
     * an enum which indicated what type of move was made
     */
    private MoveType type;

    public Move(Coordinate from, Coordinate to, MoveType type) {
        this.from = from;
        this.to = to;
        this.type = type;
    }

    public Coordinate getFrom() {
        return from;
    }

    public Coordinate getTo() {
        return to;
    }

    public MoveType getType() {
        return type;
    }

    public void setFrom(Coordinate from) {
        this.from = from;
    }

    public void setTo(Coordinate to) {
        this.to = to;
    }

    public void setType(MoveType type) {
        this.type = type;
    }

    public int getFromFile() {
        return from.getFile();
    }

    public int getFromRank() {
        return from.getRank();
    }

    public int getToFile() {
        return to.getFile();
    }

    public int getToRank() {
        return to.getRank();
    }

}
