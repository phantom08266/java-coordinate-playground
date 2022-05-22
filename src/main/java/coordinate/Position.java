package coordinate;

import java.util.Objects;

public class Position {

    public static final int MAX_POSITION = 24;
    public static final int MIN_POSITION = 0;

    private final int x;
    private final int y;

    public Position(int x, int y) {
        validMinPosition(x, y);
        validMaxPosition(x, y);

        this.x = x;
        this.y = y;
    }

    protected void validMaxPosition(int x, int y) {
        if (x > MAX_POSITION || y > MAX_POSITION) {
            throw new IllegalArgumentException("x, y 좌표값은 24를 초과할 수 없습니다.");
        }
    }

    private void validMinPosition(int x, int y) {
        if (x < MIN_POSITION || y < MIN_POSITION) {
            throw new IllegalArgumentException("x, y 좌표값은 0보다 작을 수 없습니다.");
        }
    }

    public double distance(Position position) {
        double x = Math.pow(Math.abs(position.x - this.x), 2);
        double y = Math.pow(Math.abs(position.y - this.y), 2);
        return Math.sqrt(x + y);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Position position = (Position) o;
        return x == position.x && y == position.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
