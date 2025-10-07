/**
 * A square is a special rectangle where width and height are equal.
 */
public class Square extends Rectangle {
    /**
     * Constructs a square with the specified center and side length.
     *
     * @param centerPoint the center point
     * @param side the side length
     */
    public Square(Point centerPoint, double side) {
        super(centerPoint, side, side);
    }

    /**
     * Returns the side length.
     *
     * @return the side length
     */
    public double getSide() {
        return getWidth();
    }

    @Override
    public String details() {
        return String.format("Square(center=%s, side=%.2f, area=%.2f, perimeter=%.2f)",
                getCenterPoint(), getSide(), area(), perimeter());
    }
}
