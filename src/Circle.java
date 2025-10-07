/**
 * A circle defined by its center point and radius.
 */
public class Circle extends Shape {
    private final double radius;

    /**
     * Constructs a circle with the specified center and radius.
     *
     * @param centerPoint the center point
     * @param radius the radius
     */
    public Circle(Point centerPoint, double radius) {
        super(centerPoint);
        this.radius = radius;
    }

    /**
     * Returns the radius.
     *
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String details() {
        return String.format("Circle(center=%s, radius=%.2f, area=%.2f, perimeter=%.2f)",
                getCenterPoint(), radius, area(), perimeter());
    }
}
