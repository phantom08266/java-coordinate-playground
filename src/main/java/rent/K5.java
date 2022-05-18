package rent;

import java.text.DecimalFormat;

public class K5 extends Car {

    private final String CAR_NAME = "K5";
    private final double LITER = 13;
    private double distance;

    public K5(int distance) {
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
