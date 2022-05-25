package coordinate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RectangleTest {

    List<Point> points = new ArrayList<>();

    @BeforeEach
    void setUp() {
        Point point1 = new Point(10, 10);
        Point point2 = new Point(22, 10);
        Point point3 = new Point(22, 18);
        Point point4 = new Point(10, 18);
        points.addAll(Arrays.asList(point1, point2, point3, point4));
    }

    @Test
    @DisplayName("네점이 주어지면 사각형의 넓이를 계산한다.")
    void test1() {
        Rectangle rectangle = new Rectangle(points);
        assertThat(rectangle.area()).isEqualTo(96);
    }

    @Test
    @DisplayName("직사각형만 사각형으로 인정한다.")
    void test2() {
        Point point1 = new Point(5, 5);
        Point point2 = new Point(15, 10);
        Point point3 = new Point(15, 0);
        Point point4 = new Point(24, 5);
        List<Point> points = Arrays.asList(point1, point2, point3, point4);

        assertThatThrownBy(() -> new Rectangle(points))
            .isInstanceOf(IllegalArgumentException.class);
    }

}
