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
        List<Point> points = new ArrayList<>();
        while (points.isEmpty()) {
            System.out.println("좌표를 입력하세요.");
            String coordinate = scanner.nextLine();
            points.addAll(positionParser.parses(coordinate));
        }
        if (points.size() == 2) {
            Line line = new Line(points);
            System.out.println("두 점 사이 거리는 " + line.distance());
        }
        else if (points.size() == 4) {
            Rectangle rectangle = new Rectangle(points);
            System.out.println("사각형 넓이는 "+ rectangle.getArea());
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

