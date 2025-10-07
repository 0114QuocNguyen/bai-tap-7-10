/**
 * Abstract base class for geometric shapes that have a center point.
 */
public abstract class Shape {
    protected Point centerPoint;

    /**
     * Constructs a shape with the specified center point.
     *
     * @param centerPoint the center point of the shape
     */
    public Shape(Point centerPoint) {
        this.centerPoint = centerPoint;
    }

    /**
     * Returns the center point of the shape.
     *
     * @return the center point
     */
    public Point getCenterPoint() {
        return centerPoint;
    }

    /**
     * Computes the area of the shape.
     *
     * @return the area
     */
    public abstract double area();

    /**
     * Computes the perimeter (or circumference) of the shape.
     *
     * @return the perimeter
     */
    public abstract double perimeter();

    /**
     * Returns a human-readable detailed description of the shape.
     *
     * @return details string
     */
    public abstract String details();
}
