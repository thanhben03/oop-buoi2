public class Car extends Vehicle{

    public Car(int speed) {
        super(speed);
    }

    @Override
    public void speedUp() {
        System.out.println("Toc do xe 4 banh la: " + speed);
    }
}
