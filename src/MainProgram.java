import java.util.ArrayList;
import java.util.List;

/**
 * Entry point for the shapes demo program.
 * <p>
 * The program creates several shapes, then prints the number of shapes,
 * a detailed list of shapes and their center points.
 */
public class MainProgram {
    /**
     * Program main. Creates shapes and prints requested information.
     *
     * @param args command-line arguments (ignored)
     */
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();

        shapes.add(new Rectangle(new Point(0, 0), 4, 3));
        shapes.add(new Square(new Point(2, 2), 5));
        shapes.add(new Circle(new Point(-1, 1), 2.5));

        // Number of shapes created
        System.out.println("Number of shapes created: " + shapes.size());
        System.out.println();

        // Detailed list of shapes
        System.out.println("Detailed list of shapes:");
        for (Shape s : shapes) {
            System.out.println(s.details());
        }
        System.out.println();

        // List of center points
        System.out.println("List of center points:");
        for (int i = 0; i < shapes.size(); i++) {
            System.out.printf("%d: %s\n", i + 1, shapes.get(i).getCenterPoint());
        }
    }
}
