package coordinate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PositionParser {

    private final String POSITION_REGEX = "\\((.*?)\\)";
    private final String SEPERATOR = ",";

    public Position parse(String coordinate) {
        try {
            return convertPosition(coordinate);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }

    public List<Position> parses(String coordinates) {
        try {
            return convertPositions(coordinates);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
            return Collections.emptyList();
        }
    }

    private List<Position> convertPositions(String coordinates) {
        Matcher matcher = Pattern.compile(POSITION_REGEX).matcher(coordinates);
        List<Position> positions = new ArrayList<>();
        while (matcher.find()) {
            String[] splitedPosition = matcher.group(1).split(SEPERATOR);
            positions.add(makePosition(splitedPosition));
        }
        return positions;
    }

    private Position makePosition(String[] positions) {
        int x = Integer.parseInt(positions[0]);
        int y = Integer.parseInt(positions[1]);
        return new Position(x, y);
    }

    private Position convertPosition(String coordinate) {
        Matcher matcher = Pattern.compile(POSITION_REGEX).matcher(coordinate);

        if (matcher.find()) {
            String[] positions = matcher.group(1).split(SEPERATOR);
            return makePosition(positions);
        }
        return null;
    }

}
