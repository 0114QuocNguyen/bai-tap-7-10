/**
 * Represents a 2D point with x and y coordinates.
 * <p>
 * This class is immutable: coordinates are set at construction and exposed via
 * getters.
 */
public class Point {
    private final double x;
    private final double y;

    /**
     * Creates a new point with the given coordinates.
     *
     * @param x the x coordinate
     * @param y the y coordinate
     */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Returns the x coordinate.
     *
     * @return the x coordinate
     */
    public double getX() {
        return x;
    }

    /**
     * Returns the y coordinate.
     *
     * @return the y coordinate
     */
    public double getY() {
        return y;
    }

    /**
     * Returns a string representation of the point in the form "(x, y)" with
     * two decimals.
     *
     * @return formatted coordinates
     */
    @Override
    public String toString() {
        return String.format("(%.2f, %.2f)", x, y);
    }
}
