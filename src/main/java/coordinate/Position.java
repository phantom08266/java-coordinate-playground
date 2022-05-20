package coordinate;

import java.util.Objects;

public class Position {

    public static final int MAX_POSITION = 24;
    private final int x;
    private final int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
        validMaxPosition(x, y);
    }

    protected void validMaxPosition(int x, int y) {
        if (x > MAX_POSITION || y > MAX_POSITION) {
            throw new IllegalArgumentException("좌표의 최대값 24를 초과하였습니다.");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return x == position.x && y == position.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
