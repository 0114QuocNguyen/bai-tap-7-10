/**
 * A rectangle defined by its center point, width and height.
 */
public class Rectangle extends Shape {
    private final double width;
    private final double height;

    /**
     * Constructs a rectangle with the specified center, width and height.
     *
     * @param centerPoint the center point
     * @param width the rectangle width
     * @param height the rectangle height
     */
    public Rectangle(Point centerPoint, double width, double height) {
        super(centerPoint);
        this.width = width;
        this.height = height;
    }

    /**
     * Returns the width.
     *
     * @return the width
     */
    public double getWidth() {
        return width;
    }

    /**
     * Returns the height.
     *
     * @return the height
     */
    public double getHeight() {
        return height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return 2 * (width + height);
    }

    @Override
    public String details() {
        return String.format("Rectangle(center=%s, width=%.2f, height=%.2f, area=%.2f, perimeter=%.2f)",
                centerPoint, width, height, area(), perimeter());
    }
}
