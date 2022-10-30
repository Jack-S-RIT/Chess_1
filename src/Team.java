package src;

/**
 * enum that represents the two Teams in chess
 * 
 * @author Jackson Shortell
 */
public enum Team {
    WHITE("White", "\u001b[33m"), // yellow ansi code to represent white
    BLACK("Black", "\u001B[34m"); // blue ansi code to represent black

    public static final String RESET = "\033[0;37m";
    /**
     * String representation of the Color
     */
    private String name;
    /**
     * String for ansi code corresponding with the color
     */
    private String ansi;

    Team(String name, String ansi) {
        this.name = name;
        this.ansi = ansi;
    }

    @Override
    public String toString() {
        return name;
    }

    public String getAnsi() {
        return ansi;
    }

    /**
     * 
     * @return returns the opposite team
     */
    public Team opposite() {
        return name.equals("White") ? BLACK : WHITE;
    }

}
