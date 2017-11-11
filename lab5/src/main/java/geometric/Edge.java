package geometric;

import geometric.triangle.fixtures.EdgeType;

public class Edge {
    private Double length;
    private EdgeType edgeType;

    public Edge(final double length) {
        if (length <= 0) {
            throw new IllegalArgumentException("Not an edge!");
        }
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(final double length) {
        this.length = length;
    }

    public EdgeType getEdgeType() {
        return edgeType;
    }

    public void setEdgeType(final EdgeType edgeType) {
        this.edgeType = edgeType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Edge edge = (Edge) o;
        return Double.compare(edge.length, length) == 0;
    }

    @Override
    public String toString() {
        return length != null ? String.valueOf(String.format("%.2f", length)) : "Unknown";
    }
}
