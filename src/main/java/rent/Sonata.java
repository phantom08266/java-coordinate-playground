package rent;

import java.text.DecimalFormat;

public class Sonata implements Car {

    private final String CAR_NAME = "Sonata";
    private final double LITER = 10;

    private double distance;

    public Sonata(int distance) {
        super();
        this.distance = distance;
    }

    @Override
    public double getDistancePerLiter() {
        return LITER;
    }

    @Override
    public double getTripDistance() {
        return distance;
    }

    @Override
    public String getName() {
        return CAR_NAME;
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("0");
        return CAR_NAME + " : " +
                decimalFormat.format(getChargeQuantity()) + "리터"
                + "\n";
    }
}
