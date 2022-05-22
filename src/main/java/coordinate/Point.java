package coordinate;

import java.util.Objects;

public class Point {

    public static final int MAX_POSITION = 24;
    public static final int MIN_POSITION = 0;

    private final int x;
    private final int y;

    public Point(int x, int y) {
        validMinPosition(x, y);
        validMaxPosition(x, y);

        this.x = x;
        this.y = y;
    }

    private void validMaxPosition(int x, int y) {
        if (x > MAX_POSITION || y > MAX_POSITION) {
            throw new IllegalArgumentException("x, y 좌표값은 24를 초과할 수 없습니다.");
        }
    }

    private void validMinPosition(int x, int y) {
        if (x < MIN_POSITION || y < MIN_POSITION) {
            throw new IllegalArgumentException("x, y 좌표값은 0보다 작을 수 없습니다.");
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
