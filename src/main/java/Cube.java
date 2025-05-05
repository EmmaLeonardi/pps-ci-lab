public class Cube {

    private final double edge;

    public Cube(final double edge) {
        this.edge = edge;
    }

    public double getVolume() {
        return this.edge * this.edge * this.edge;
    }

    public double getArea() {
        return this.edge * this.edge * 6;
    }

    public double getEdge() {
        return this.edge;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Cube of edge:" + edge;
    }
}
