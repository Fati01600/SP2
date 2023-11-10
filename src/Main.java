public class Main {
    public static void main(String[] args) {
        FleetOfCars fleet = new FleetOfCars();

        fleet.addCar((Car) new GasolineCar("XYYZ140", "Volvo", "XC90", 4, 12));
        fleet.addCar((Car) new DieselCar("AAB456", "Mercedes", "E-klasse", 4, 17, true));
        fleet.addCar((Car) new ElectricCar("FATI789", "Chevrolet", "Bolt", 4, 60, 238));

//UDskriver oplysningerne for hver bil i flåden
        System.out.println("Biler i flåden:");
        System.out.println(fleet);

        //Beregner og udskriver samlede registeringsafgift for bilerne i flåden
        int totalFee = fleet.getTotalRegistrationFeeForFleet();
        System.out.println("Den samlede registreringsafgift for flåden: " + totalFee + " kr");
    }
}