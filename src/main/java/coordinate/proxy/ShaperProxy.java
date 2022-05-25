package coordinate.proxy;

import coordinate.Point;
import coordinate.Shaper;

import java.util.List;

public interface ShaperProxy {

    Shaper create(List<Point> points);
}
