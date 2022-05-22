package coordinate.creator;

import coordinate.Figure;
import coordinate.FigureCreator;
import coordinate.Point;
import coordinate.Triangle;
import java.util.List;

public class TriangleCreator implements FigureCreator {

    public TriangleCreator() {
    }

    @Override
    public Figure create(List<Point> points) {
        return new Triangle(points);
    }
}
