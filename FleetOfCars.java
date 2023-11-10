import java.util.ArrayList;
public class FleetOfCars {
    private ArrayList<Car> cars;

    public FleetOfCars() {
        cars = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Car car : cars) {
            sb.append(car.toString()).append("\n");
        }
        return sb.toString();
    }

    public int getTotalRegistrationFeeForFleet() {
        int totalFee = 0;
        for (Car car : cars) {
            totalFee += car.getRegistrationFee();
        }
        return totalFee;
    }
}
