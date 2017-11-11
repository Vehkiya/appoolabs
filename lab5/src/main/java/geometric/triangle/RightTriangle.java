package geometric.triangle;

import geometric.Angle;
import geometric.Edge;
import geometric.triangle.fixtures.TriangleTypeAngle;
import geometric.triangle.fixtures.TriangleTypeLength;

import java.util.Arrays;

public class RightTriangle implements Triangle {

    private Edge[] cathetis;
    private Edge hypotenuse;
    private Angle[] angles = new Angle[]{new Angle(90), new Angle(), new Angle()};
    private Double perimeter;
    private Double area;
    private TriangleTypeAngle triangleTypeAngle = TriangleTypeAngle.RIGHT;
    private TriangleTypeLength triangleTypeLength;

    public RightTriangle(Edge[] cathetis) {
        if (cathetis[0].equals(cathetis[1])) {
            this.triangleTypeLength = TriangleTypeLength.ISOSCEL;
        }
        this.angles = new Angle[]{new Angle(90), new Angle(45), new Angle(45)};
        this.cathetis = cathetis;
        this.hypotenuse = new Edge(pythagoreanTheorem(cathetis));
    }

    public RightTriangle(Edge catheta, Edge hypotenuse) {
        this.hypotenuse = hypotenuse;
        this.cathetis = new Edge[]{catheta, new Edge(pythagoreanTheorem(catheta, hypotenuse))};
    }

    public Double getArea() {
        if (this.area == null) {
            this.area = cathetis[0].getLength() * cathetis[1].getLength() / 2;
        }
        return area;
    }

    public Double getPerimeter() {
        if (this.perimeter == null) {
            this.perimeter = cathetis[0].getLength() + cathetis[1].getLength() + hypotenuse.getLength();
        }
        return perimeter;
    }

    private Double pythagoreanTheorem(Edge catheta, Edge hypotenuse) {
        return Math.sqrt(Math.pow(hypotenuse.getLength(), 2) - Math.pow(catheta.getLength(), 2));
    }

    private Double pythagoreanTheorem(Edge[] cathetis) {
        return Math.sqrt(Math.pow(cathetis[0].getLength(), 2) + Math.pow(cathetis[1].getLength(), 2));
    }

    public Edge[] getCathetis() {
        return cathetis;
    }

    public Edge getHypotenuse() {
        return hypotenuse;
    }

    public Angle[] getAngles() {
        return angles;
    }

    public TriangleTypeAngle getTriangleTypeAngle() {
        return triangleTypeAngle;
    }

    public TriangleTypeLength getTriangleTypeLength() {
        return triangleTypeLength;
    }

    @Override
    public String toString() {
        return "RightTriangle{" +
                "cathetis=" + Arrays.toString(cathetis) +
                ", hypotenuse=" + hypotenuse +
                ", angles=" + Arrays.toString(angles) +
                '}';
    }
}
