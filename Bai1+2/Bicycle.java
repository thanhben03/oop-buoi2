public class Bicycle extends Vehicle{

    public Bicycle(int speed) {
        super(speed);
    }

    @Override
    public void speedUp() {
        System.out.println("Toc do xe dap la: " + speed);
    }
}
