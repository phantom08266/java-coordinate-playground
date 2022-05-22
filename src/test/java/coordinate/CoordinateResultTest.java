package coordinate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CoordinateResultTest {

    @Test
    @DisplayName("두점 Position이 주어지면 두점사이의 거리를 계산한다.")
    void test1() {
        Point point1 = new Point(10,10);
        Point point2 = new Point(14,15);

        Line line = new Line(point1, point2);
        CoordinateResult result = new CoordinateResult(line);
        assertThat(result.getDistance())
            .isEqualTo(6.403124)
            .isEqualTo(6.40, offset(0.02d))
            .isEqualTo(6.403, offset(0.003d));
    }
}
