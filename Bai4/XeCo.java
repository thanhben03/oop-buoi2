public class XeCo {
    String model;
    String shape;
    int year;
    String fuelType;
    float maxSpeed;
    double fuelEfficiency;
    double distanceTraveled;

    public XeCo(
            String model, String shape, int year,
            String fuelType, float maxSpeed, double fuel_efficiency, double distanceTraveled
    ) {
        this.model = model;
        this.shape = shape;
        this.year = year;
        this.fuelType = fuelType;
        this.maxSpeed = maxSpeed;
        this.fuelEfficiency = fuel_efficiency;
        this.distanceTraveled = distanceTraveled;
    }

}
