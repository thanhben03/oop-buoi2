public class Motorcycle extends XeCo{
    public Motorcycle(
            String model, String shape, int year, String fuelType,
            float maxSpeed, double fuel_efficiency, double distanceTraveled,
            float timeTraveled
    )
    {
        super(model, shape, year, fuelType, maxSpeed, fuel_efficiency, distanceTraveled, timeTraveled);
    }

    public void getInfo() {
        getModelName();
        getEfficiencyFuel();
        getDistanceTraveled();
        getMaxSpeed();
    }

    public void getModelName() {
        System.out.println("Motorcycle Model: " + model);
    }

    public void getEfficiencyFuel() {
        System.out.println("Fuel EfficiencyFuel: " + fuelEfficiency + " mpg");
    }

    public void getDistanceTraveled() {
        float distance = maxSpeed * timeTraveled;
        System.out.println("Distance Traveled: " + distance + " miles");
    }

    public void getMaxSpeed() {
        System.out.println("Max Speed: " + maxSpeed + " mph");
    }
}
