package rent;

public abstract class Car {

    public abstract double getDistancePerLiter();

    public abstract double getTripDistance();

    public abstract String getName();

    public Car() {
    }

    public double getChargeQuantity() {
        return getTripDistance() / getDistancePerLiter();
    }
}
