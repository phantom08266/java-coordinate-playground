package coordinate.proxy;

import coordinate.Point;
import coordinate.Rectangle;
import coordinate.Shaper;

import java.util.List;

public class RectangleProxy implements ShaperProxy {

    public RectangleProxy() {
    }

    @Override
    public Shaper create(List<Point> points) {
        return new Rectangle(points);
    }
}
