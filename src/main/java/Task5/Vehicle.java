package Task5;

public class Vehicle {
    double speed;
    double maxSpeed;

    public Vehicle(double speed, double maxSpeed) {
        this.speed = speed;
        this.maxSpeed = maxSpeed;
    }

    public void accelerate(double speed) {
        if (this.speed + speed <= maxSpeed) {
            this.speed += speed;
        } else {
            System.out.println("Too fast");
        }
    }

    public void breaking(double speed) {
        if (this.speed - speed >= 0) {
            this.speed -= speed;
        }
    }
}
