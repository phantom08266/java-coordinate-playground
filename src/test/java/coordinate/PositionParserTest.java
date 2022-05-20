package coordinate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class PositionParserTest {

    @Test
    @DisplayName("입력받은 (5,6)좌표값은 Position 오브젝트로 반환에 성공한다.")
    void test1() {
        PositionParser positionParser = new PositionParser();
        Position position = new Position(5,6);
        assertThat(positionParser.parse("(5,6)")).isEqualTo(position);
    }

    @ParameterizedTest
    @DisplayName("좌표값이 최대값 24를 넘어가면 null을 반환한다.")
    @ValueSource(strings = {"(25,6)", "(2, 25)", "(25,48)"})
    void test2(String input) {
        PositionParser positionParser = new PositionParser();
        assertThat(positionParser.parse(input)).isNull();
    }

    @Test
    @DisplayName("좌표값이 여러개 입력 시 (10,10)-(14,15) Position을 리스트로 반환한다.")
    void test3() {
        PositionParser positionParser = new PositionParser();
        assertThat(positionParser.parses("(10,10)-(14,15)"))
            .isNotEmpty()
            .contains(new Position(14,15))
            .contains(new Position(10,10));
    }

    @ParameterizedTest
    @DisplayName("좌표값 범위가 벗어난 좌표값이 포함될 시 빈 리스트를 반환한다.")
    @ValueSource(strings = {"(30,10)-(25,35)", "(30,10)-(24,24)", "(0,0)-(25,35)"})
    void test4(String input) {
        PositionParser positionParser = new PositionParser();
        assertThat(positionParser.parses(input)).isEmpty();
    }
}
