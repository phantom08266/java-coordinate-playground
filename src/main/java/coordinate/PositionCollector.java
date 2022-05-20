package coordinate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PositionCollector {

    private final String POSITION_REGEX = "\\((.*?)\\)";
    private final String SEPERATOR = ",";

    public Position parse(String coordinate) {
        Matcher matcher = Pattern.compile(POSITION_REGEX).matcher(coordinate);
        if (matcher.find()) {
            String[] positions = matcher.group(1).split(SEPERATOR);
            int x = Integer.parseInt(positions[0]);
            int y = Integer.parseInt(positions[1]);
            return new Position(x, y);
        }
        return new Position(0, 0);
    }
}
