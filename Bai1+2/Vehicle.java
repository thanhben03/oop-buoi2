public class Vehicle {
    int speed = 10;

    public Vehicle(){}

    public Vehicle(int speed){
        this.speed = speed;
    }

    public void speedUp() {
        System.out.println("Toc do xe binh thuong la: " + speed);
    }
}
