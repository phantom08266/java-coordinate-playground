package coordinate;

import java.util.List;

public class Triangle implements Shaper {

    private final double distance1;
    private final double distance2;
    private final double distance3;

    public Triangle(List<Point> points) {
        validTrianglePoint(points);
        distance1 = getDistance(points.get(0), points.get(1));
        distance2 = getDistance(points.get(1), points.get(2));
        distance3 = getDistance(points.get(0), points.get(2));
    }

    private double getDistance(Point firstPoint, Point secondPoint) {
        Line line = new Line(firstPoint, secondPoint);
        return line.area();
    }

    private void validTrianglePoint(List<Point> points) {
        if (points.size() != 3) {
            throw new IllegalArgumentException("삼각형은 세 좌표가 필요합니다.");
        }
    }

    @Override
    public String getTopic() {
        return "삼각형 넓이는 ";
    }

    @Override
    public double area() {
        double intercept = (distance1 + distance2 + distance3) / 2;
        double result =
                intercept * (intercept - distance1) * (intercept - distance2) * (intercept - distance3);

        double sqrtResult = Math.round(Math.sqrt(result));
//        System.out.println("삼각형 넓이는 " + sqrtResult);
        return sqrtResult;
    }

}
