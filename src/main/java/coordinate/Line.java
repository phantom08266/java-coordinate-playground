package coordinate;

import java.util.List;

public class Line implements Shaper {


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

    @Override
    public String getTopic() {
        return "두점 사이의 거리는 ";
    }

    @Override
    public double area() {
        double x = Math.pow(Math.abs(firstPoint.getX() - secondPoint.getX()), 2);
        double y = Math.pow(Math.abs(firstPoint.getY() - secondPoint.getY()), 2);
        String distance = String.format("%.6f", Math.sqrt(x + y));
        double result = Double.parseDouble(distance);
//        System.out.println("두 점 사이 거리는 " + result);
        return result;
    }
}
