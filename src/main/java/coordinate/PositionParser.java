package coordinate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PositionParser {

    private final String POSITION_REGEX = "\\((.*?)\\)";
    private final String SEPERATOR = ",";

    public Point parse(String coordinate) {
        try {
            return convertPosition(coordinate);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }

    public List<Point> parses(String coordinates) {
        try {
            return convertPositions(coordinates);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
            return Collections.emptyList();
        }
    }

    private List<Point> convertPositions(String coordinates) {
        Matcher matcher = Pattern.compile(POSITION_REGEX).matcher(coordinates);
        List<Point> points = new ArrayList<>();
        while (matcher.find()) {
            String[] splitedPosition = matcher.group(1).split(SEPERATOR);
            points.add(makePosition(splitedPosition));
        }
        return points;
    }

    private Point makePosition(String[] positions) {
        int x = Integer.parseInt(positions[0]);
        int y = Integer.parseInt(positions[1]);
        return new Point(x, y);
    }

    private Point convertPosition(String coordinate) {
        Matcher matcher = Pattern.compile(POSITION_REGEX).matcher(coordinate);

        if (matcher.find()) {
            String[] positions = matcher.group(1).split(SEPERATOR);
            return makePosition(positions);
        }
        return null;
    }

}
