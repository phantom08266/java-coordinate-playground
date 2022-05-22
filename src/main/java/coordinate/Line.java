package coordinate;

import java.util.List;

public class Line {


    public static final int LINE_POSITION_SIZE = 2;
    private final Point firstPoint;
    private final Point secondPoint;

    public Line(Point firstPoint, Point secondPoint) {
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
    }

    public Line(List<Point> points) {
        validLinePosition(points);
        this.firstPoint = points.get(0);
        this.secondPoint = points.get(1);
    }

    private void validLinePosition(List<Point> points) {
        if (points.size() != LINE_POSITION_SIZE) {
            throw new IllegalArgumentException("두점을 입력해주세요");
        }
    }

    public double distance() {
        double x = Math.pow(Math.abs(firstPoint.getX() - secondPoint.getX()), 2);
        double y = Math.pow(Math.abs(firstPoint.getY() - secondPoint.getY()), 2);
        return Math.sqrt(x + y);
    }
}
