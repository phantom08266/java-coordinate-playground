package coordinate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInputController {

    private final Scanner scanner;
    private final PositionParser positionParser;

    public UserInputController(Scanner scanner, PositionParser positionParser) {
        this.scanner = scanner;
        this.positionParser = positionParser;
    }

    public void coordinateUserInput() {
        boolean enable = true;
        List<Position> positions = new ArrayList<>();
        while (positions.isEmpty()) {
            System.out.println("좌표를 입력하세요.");
            String coordinate = scanner.nextLine();
            positions.addAll(positionParser.parses(coordinate));
        }
    }
}

class test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PositionParser positionParser = new PositionParser();
        UserInputController userInputController = new UserInputController(scanner,
            positionParser);
        userInputController.coordinateUserInput();
    }
}

