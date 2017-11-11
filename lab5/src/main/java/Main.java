import geometric.Edge;
import geometric.triangle.RightTriangle;
import geometric.triangle.Triangle;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new RightTriangle(new Edge(4), new Edge(5));
        System.out.println(triangle);
        System.out.println(String.format("Area = %.2f", triangle.getArea()));
        System.out.println(String.format("Perimeter = %.2f", triangle.getPerimeter()));
    }
}
