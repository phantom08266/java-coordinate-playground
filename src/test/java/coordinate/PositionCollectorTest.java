package coordinate;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PositionCollectorTest {

    @Test
    @DisplayName("입력받은 (5,6)좌표값은 Position 오브젝트로 반환에 성공한다.")
    void test1() {
        PositionCollector positionCollector = new PositionCollector();
        Position position = new Position(5,6);
        Assertions.assertThat(positionCollector.parse("(5,6)")).isEqualTo(position);
    }

}
