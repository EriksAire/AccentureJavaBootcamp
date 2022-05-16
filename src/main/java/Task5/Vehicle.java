package Task5;

import org.apache.log4j.Logger;

public class Vehicle {
    static Logger logger = Logger.getLogger(Vehicle.class);
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
            logger.warn("Too fast");
        }
    }

    public void breaking(double speed) {
        if (this.speed - speed >= 0) {
            this.speed -= speed;
        }
    }
}
