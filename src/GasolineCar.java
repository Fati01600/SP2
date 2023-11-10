public class GasolineCar extends AFuelCar{
    public GasolineCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre){
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
    }

    @Override
    String getFuelType() {
        return "Gasoline";
    }

    @Override
    public int getRegistrationFee() {
        if (super.getKmPrLitre() >= 20 && super.getKmPrLitre() <= 50) {
            return 330;
        }
        else if (super.getKmPrLitre() <= 15 && super.getKmPrLitre() < 20){
            return 1050;
        }
        else if (super.getKmPrLitre() >= 10 && super.getKmPrLitre() < 15) {
            return 2340;
        }
        else if (super.getKmPrLitre() <= 5 && super.getKmPrLitre() < 10) {
            return 5500;
        }
        else if (super.getKmPrLitre() < 5) {
            return 10470;
        }
        return 0;
    }

    @Override
    public String toString() {
        return super.toString() + ", Fuel Type:" + getFuelType();
    }
}
