public class ElectricCar extends ACar{
    private int batteryCapacityKwh;
    private int maxRangeKm;
    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, int batteryCapacityKWh, int maxRangeKm){
        super(registrationNumber, make, model, numberOfDoors);
        this.batteryCapacityKwh = batteryCapacityKWh;
        this.maxRangeKm = maxRangeKm;
    }
    public double getBatteryCapacityKWh(){
        return batteryCapacityKwh;
    }

    public double getMaxRangeKm() {
        return maxRangeKm;
    }
    public double getWhPrKm(){
        return (batteryCapacityKwh / maxRangeKm) * 1000;
    }

    @Override
    public int getRegistrationFee() {
        //Omregner fra Wh/km til km/1
        double kmPrLitreEquivalent = 100 / (getWhPrKm() / 91.25);
        //Vi bruger samme regel som vi brugte i GasolineCar
        if (kmPrLitreEquivalent >= 20 && kmPrLitreEquivalent <= 50) {
            return 330;
        }
        else if (kmPrLitreEquivalent >= 15 && kmPrLitreEquivalent < 20){
            return 1050;
        }
        else if (kmPrLitreEquivalent >= 10 && kmPrLitreEquivalent < 15){
            return 2340;
        }
        else if (kmPrLitreEquivalent >= 5 && kmPrLitreEquivalent < 10){
            return 5500;
        }
        else if (kmPrLitreEquivalent < 5){
            return 10470;
        }
        return 0;
    }

    @Override
    public String toString() {
      return super.toString()+ ", Battery Capacity (kWh): " + batteryCapacityKwh + ", Max Range (Km): " + getMaxRangeKm();
    }
}
