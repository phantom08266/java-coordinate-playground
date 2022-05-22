package coordinate;

import coordinate.creator.LineCreator;
import coordinate.creator.RectangleCreator;
import coordinate.creator.TriangleCreator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FigureFactory {

    private static Map<Integer, FigureCreator> factory = new HashMap<>();

    static {
        factory.put(Line.LINE_POINT_SIZE, new LineCreator());
        factory.put(Triangle.TRIANGLE_POINT_SIZE, new TriangleCreator());
        factory.put(Rectangle.RECTANGLE_POINT_SIZE, new RectangleCreator());
    }

    static Figure getInstance(List<Point> points) {
        validFigure(points);

        return factory.get(points.size()).create(points);
//        if (points.size() == Line.LINE_POINT_SIZE) {
//            return new Line(points);
//        }
//
//        if (points.size() == Triangle.TRIANGLE_POINT_SIZE) {
//            return new Triangle(points);
//        }
//
//        if (points.size() == Rectangle.RECTANGLE_POINT_SIZE) {
//            return new Rectangle(points);
//        }
    }

    private static void validFigure(List<Point> points) {
        if (points.size() <= 1 || points.size() > Rectangle.RECTANGLE_POINT_SIZE) {
            throw new IllegalArgumentException("유효하지 않은 도형입니다.");
        }
    }
}
