package coordinate;

public class CoordinateResult {

    private double distance;

    public CoordinateResult(Position firstPoint, Position secondPoint) {
        distance = firstPoint.distance(secondPoint);
    }

    public double getDistance() {
        String format = String.format("%.6f", distance);
        return Double.parseDouble(format);
    }
}
