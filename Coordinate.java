
/**
 * class that represents the coordinates on a chess board
 * 
 * @author Jackson Shortell
 */
public class Coordinate {

    /**
     * an int to measure horizontal position
     */
    private int file;

    /**
     * an int to measure vertical position
     */
    private int rank;

    /**
     * a Team enum to represent the color of the coordinates corresponding square
     */
    private Team color;

    /**
     * a number that can uniquely a coordinate
     */
    private int id;

    /**
     * helper function for the constructor
     * determines the color of the square from the file and the rank
     * 
     * @return returns Team.BLACK if the sum of the file and the rank is even,
     *         returns Team.White otherwise
     */
    private Team determineColor() {
        if ((file + rank) % 2 == 0) {
            return Team.BLACK;
        } else {
            return Team.WHITE;
        }
    }

    private Coordinate(int file, int rank) {
        this.file = file;
        this.rank = rank;
        this.color = determineColor();
        this.id = rank * 8 + file;
    }

    /**
     * creates and returns a coordinate only if the file and rank are equal to 0-7
     * 
     * @param file passes in an int
     * @param rank passes in an int
     * @return returns a Coordinate if file and rank are equal to 0-7 and null
     *         otherwise
     */
    public static Coordinate make(int file, int rank) {
        if ((file >= 0 && file <= 7) && (rank >= 0 && rank <= 7)) {
            return new Coordinate(file, rank);
        }
        return null;
    }

    public int getFile() {
        return file;
    }

    public int getRank() {
        return rank;
    }

    public Team getTeam() {
        return color;
    }

    @Override
    public String toString() {
        char fileStr = (char) (file + 65);
        int rankStr = (rank + 1);
        return fileStr + rankStr + "";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Coordinate) {
            Coordinate other = (Coordinate) obj;
            return this.id == other.id;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return id;
    }

}