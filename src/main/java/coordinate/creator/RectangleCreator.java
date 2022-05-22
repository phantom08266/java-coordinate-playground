package coordinate.creator;

import coordinate.Figure;
import coordinate.FigureCreator;
import coordinate.Point;
import coordinate.Rectangle;
import java.util.List;

public class RectangleCreator implements FigureCreator {

    public RectangleCreator() {
    }

    @Override
    public Figure create(List<Point> points) {
        return new Rectangle(points);
    }
}
