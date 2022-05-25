package coordinate;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TriangleTest {

    List<Point> points = new ArrayList<>();

    @BeforeEach
    void setUp() {
        Point point1 = new Point(10, 10);
        Point point2 = new Point(14, 15);
        Point point3 = new Point(20, 8);
        points.addAll(Arrays.asList(point1, point2, point3));
    }

    @Test
    @DisplayName("세 좌표가 주어지면 삼각형 넓이를 구한다.")
    void test1() {
        Triangle triangle = new Triangle(points);
        Assertions.assertThat(triangle.area()).isEqualTo(29.0);
    }
}