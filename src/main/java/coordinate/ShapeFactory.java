package coordinate;

import coordinate.proxy.LineProxy;
import coordinate.proxy.RectangleProxy;
import coordinate.proxy.ShaperProxy;
import coordinate.proxy.TriangleProxy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShapeFactory {
    private Map<Integer, ShaperProxy> shaperMap;

    public ShapeFactory() {
        shaperMap = new HashMap<>();
        shaperMap.put(2, new LineProxy());
        shaperMap.put(3, new TriangleProxy());
        shaperMap.put(4, new RectangleProxy());
    }

    public Shaper getShape(List<Point> points) {
        return shaperMap.get(points.size()).create(points);
    }
}
