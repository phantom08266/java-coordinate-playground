package coordinate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInputController {

    private final Scanner scanner;
    private final PositionParser positionParser;

    private final ShapeFactory shapeFactory;

    public UserInputController(Scanner scanner, PositionParser positionParser, ShapeFactory shapeFactory) {
        this.scanner = scanner;
        this.positionParser = positionParser;
        this.shapeFactory = shapeFactory;
    }

    public void coordinateUserInput() {
        boolean enable = true;
        List<Point> points = new ArrayList<>();

        while (points.isEmpty()) {
            System.out.println("좌표를 입력하세요.");
            String coordinate = scanner.nextLine();
            points.addAll(positionParser.parses(coordinate));
        }
        Shaper shape = shapeFactory.getShape(points);
        shape.area();
        shape.print();
    }
}

class test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PositionParser positionParser = new PositionParser();
        ShapeFactory shapeFactory = new ShapeFactory();
        UserInputController userInputController = new UserInputController(scanner,
            positionParser, shapeFactory);
        userInputController.coordinateUserInput();
    }
}

