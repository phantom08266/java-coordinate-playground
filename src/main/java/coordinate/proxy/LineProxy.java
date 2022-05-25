package coordinate.proxy;

import coordinate.Line;
import coordinate.Point;
import coordinate.Shaper;

import java.util.List;

public class LineProxy implements ShaperProxy {

    public LineProxy() {
    }

    @Override
    public Shaper create(List<Point> points) {
        return new Line(points);
    }
}
