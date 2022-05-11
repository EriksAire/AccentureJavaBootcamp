package Task5;

public class Car extends Vehicle {
    int gear;
    int maxGear;

    public Car(double speed, double maxSpeed, int gear, int maxGear) {
        super(speed, maxSpeed);
        this.gear = gear;
        this.maxGear = maxGear;
    }

    public void steerRight() {
        System.out.println("Car turns right");
    }

    public void steerLeft() {
        System.out.println("Car turns left");
    }

    public void changeGear(int gear) {
        if (gear <= this.maxGear && gear > 0) {
            this.gear = gear;
        } else {
            throw new IllegalArgumentException("Wrong gear");
        }
    }

    @Override
    public void accelerate(double speed) {
        super.accelerate(speed);
    }

    @Override
    public void breaking(double speed) {
        super.breaking(speed);
    }

    @Override
    public String toString() {
        return "Car{" +
                "current speed=" + speed +
                "max speed=" + maxSpeed +
                "gear=" + gear +
                ", maxGear=" + maxGear +
                '}';
    }
}
