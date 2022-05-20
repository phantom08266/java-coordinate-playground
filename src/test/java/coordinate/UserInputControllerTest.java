package coordinate;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Scanner;

@ExtendWith(MockitoExtension.class)
public class UserInputControllerTest {

    @Mock
    private Scanner scanner;

    @Mock
    private PositionCollector positionCollector;


    @Test
    @DisplayName("좌표값은 24초과 시 validMaxPosition가 false를 반환한다.")
    void test1() {
        UserInputController userInputController = new UserInputController(scanner, positionCollector);
        Assertions.assertThat(userInputController.validMaxPosition("25")).isFalse();
    }
}
