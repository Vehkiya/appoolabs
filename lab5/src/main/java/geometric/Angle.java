package geometric;

public class Angle {
    private Double measure;

    public Angle() {
    }

    public Angle(double measure) {
        while (measure >= 360) {
            measure = measure - 360;
        }
        this.measure = measure;
    }

    public double getMeasure() {
        return measure;
    }

    public void setMeasure(double measure) {
        this.measure = measure;
    }

    public boolean isRightAngle() {
        return measure == 90;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Angle angle = (Angle) o;
        return Double.compare(angle.measure, measure) == 0;
    }

    @Override
    public String toString() {
        return measure != null ? String.valueOf(measure) : "Unknown";
    }
}
