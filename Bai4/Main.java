public class Main {
    public static void main(String[] args) {
        Truck truck = new Truck("Tatra 810 4x4", "Trangle",
                2014, "Type 1",
                80, 8.075659532105526,
                65.5097501244400, 1.2f
        );

        Car car = new Car("Virtus", "Circle",
                2012, "Type 2",
                120, 2.355,
                14.419665,1.3f
        );

        Motorcycle motorcycle = new Motorcycle("Warrior200", "Rectangle",
                2017, "Type 3",
                80, 2.1,
                4.41,1.4f
        );

        truck.getInfo();
        System.out.println();

        car.getInfo();
        System.out.println();

        motorcycle.getInfo();
    }
}
