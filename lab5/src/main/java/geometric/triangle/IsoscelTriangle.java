package geometric.triangle;

import geometric.Angle;
import geometric.Edge;

public class IsoscelTriangle implements Triangle {
    private Edge congruentEdge;
    private Edge base;
    private Angle congruentAngle;
    private Angle top;
    private Double height;

    public IsoscelTriangle(Edge congruentEdge, Edge base) {
        this.congruentEdge = congruentEdge;
        this.base = base;
    }

    public IsoscelTriangle(Edge base, Double height) {
        this.base = base;
        this.height = height;
    }

    public Double getArea() {
        return null;
    }

    public Double getPerimeter() {
        return null;
    }

    public Edge getCongruentEdge() {
        return congruentEdge;
    }

    public Edge getBase() {
        return base;
    }

    public Angle getCongruentAngle() {
        return congruentAngle;
    }

    public Angle getTop() {
        return top;
    }

    public Double getHeight() {
        return height;
    }
}
