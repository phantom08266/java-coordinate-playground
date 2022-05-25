package coordinate;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Rectangle implements Shaper {

    public static final int RECTANGLE_POINT_SIZE = 4;
    public static final int HORIZONTAL_LINE_SIZE = 2;
    public static final int VERTICAL_LINE_SIZE = 2;

    private int width;
    private int height;

    public Rectangle(List<Point> points) {
        validRectanglePoint(points);
        validHorizontal(points);
        validVertical(points);
    }

    private void validRectanglePoint(List<Point> points) {
        if (points.size() != RECTANGLE_POINT_SIZE) {
            throw new IllegalArgumentException("사각형의 좌표는 4개여야 합니다.");
        }
    }

    private void validHorizontal(List<Point> points) {
        Map<Integer, List<Point>> horizontalLine = points.stream()
                .collect(Collectors.groupingBy(Point::getX));
        if (horizontalLine.size() != HORIZONTAL_LINE_SIZE) {
            throw new IllegalArgumentException("직사각형이 아닙니다.");
        }

        width = getDistance(horizontalLine);
    }

    private void validVertical(List<Point> points) {
        Map<Integer, List<Point>> verticalLine = points.stream()
                .collect(Collectors.groupingBy(Point::getY));

        if (verticalLine.size() != VERTICAL_LINE_SIZE) {
            throw new IllegalArgumentException("직사각형이 아닙니다.");
        }
        height = getDistance(verticalLine);
    }

    private int getDistance(Map<Integer, List<Point>> horizontalLine) {
        List<Point> twoPoint = horizontalLine.values()
                .stream()
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("좌표값이 올바르지 않습니다."));
        Line line = new Line(twoPoint);
        return (int) line.area();
    }

    @Override
    public String getTopic() {
        return "사각형 넓이는 ";
    }

    @Override
    public double area() {
        int result = width * height;
//        System.out.println("사각형 넓이는 "+ result);
        return result;
    }
}
