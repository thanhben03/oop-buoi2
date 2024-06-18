public class Truck extends XeCo{

    public Truck(String model, String shape, int year, String fuelType, float maxSpeed, double fuel_efficiency, double distanceTraveled) {
        super(model, shape, year, fuelType, maxSpeed, fuel_efficiency, distanceTraveled);
    }

    public void getInfo() {
        getModelName();
        getEfficiencyFuel();
        getDistanceTraveled();
        getMaxSpeed();
    }

    public void getModelName() {
        System.out.println("Truck Model: " + model);
    }

    public void getEfficiencyFuel() {
        System.out.println("Fuel EfficiencyFuel: " + fuelEfficiency + " mpg");
    }

    public void getDistanceTraveled() {
        System.out.println("Distance Traveled: " + distanceTraveled + " miles");
    }

    public void getMaxSpeed() {
        System.out.println("Max Speed: " + maxSpeed + " mph");
    }

}
