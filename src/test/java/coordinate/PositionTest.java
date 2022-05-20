package coordinate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class PositionTest {

    @ParameterizedTest
    @DisplayName("좌표값은 x, y 각각 24초과 시 예외가 발생한다.")
    @CsvSource(value = {"25:25", "45:5", "2:25"}, delimiter = ':')
    void test1(int x, int y) {
        assertThatThrownBy(() -> new Position(x, y))
            .isInstanceOf(IllegalArgumentException.class);
    }

    @ParameterizedTest
    @DisplayName("좌표값은 x, y 최소 0까지 허용한다.")
    @CsvSource(value = {"-1:0", "0:-1", "-1:-1"}, delimiter = ':')
    void test2(int x, int y) {
        assertThatThrownBy(() -> new Position(x, y))
            .isInstanceOf(IllegalArgumentException.class);
    }


}
