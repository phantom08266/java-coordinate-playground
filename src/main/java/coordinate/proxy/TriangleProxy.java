package coordinate.proxy;

import coordinate.Point;
import coordinate.Shaper;
import coordinate.Triangle;

import java.util.List;

public class TriangleProxy implements ShaperProxy {

    public TriangleProxy() {
    }

    @Override
    public Shaper create(List<Point> points) {
        return new Triangle(points);
    }
}
