package coordinate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CoordinateResultTest {

    @Test
    @DisplayName("두점 Position이 주어지면 두점사이의 거리를 계산한다.")
    void test1() {
        Position position1 = new Position(10,10);
        Position position2 = new Position(14,15);

        CoordinateResult result = new CoordinateResult(position1, position2);
        assertThat(result.getDistance())
            .isEqualTo(6.403124)
            .isEqualTo(6.40, offset(0.02d))
            .isEqualTo(6.403, offset(0.003d));
    }
}
