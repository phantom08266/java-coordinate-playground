package coordinate;

import java.util.Scanner;

public class UserInputController {
    public static final int MAX_POSITION = 24;
    private final Scanner scanner;

    public UserInputController(Scanner scanner) {
        this.scanner = scanner;
    }

    public void coordinateUserInput() {
        boolean enable = true;
        while(enable) {
            System.out.println("좌표를 입력하세요.");
            String position = scanner.nextLine();
            enable = !validMaxPosition(position);
        }
    }

    protected boolean validMaxPosition(String position) {
        int comparePosition = Integer.parseInt(position);
        if (comparePosition > MAX_POSITION) {
            System.out.println("좌표의 최대값 24를 초과하였습니다.");
            return false;
        }
        return true;
    }
}
