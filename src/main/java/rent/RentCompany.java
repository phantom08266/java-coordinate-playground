package rent;

import java.util.ArrayList;
import java.util.List;

public class RentCompany {

    private static RentCompany rentCompany;

    private static List<Car> cars;

    public static RentCompany create() {
        if (rentCompany == null) {
            rentCompany = new RentCompany();
            cars = new ArrayList<>();
        }
        return rentCompany;
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    private RentCompany() {
    }

    public String generateReport() {
        StringBuilder stringBuilder = new StringBuilder();
        cars.forEach(stringBuilder::append);

        return stringBuilder.toString();
    }
}
