package coordinate;

public class CoordinateResult {

    private double distance;

    public CoordinateResult(Line line) {
        distance = line.distance();
    }

    public double getDistance() {
        String format = String.format("%.6f", distance);
        return Double.parseDouble(format);
    }
}
