package Task5;

public class SpecificCar extends Car{
    String carName;

    public SpecificCar(int gear, int maxGear ,double maxSpeed, double speed, String carName) {
        super(speed, maxSpeed, gear, maxGear);
        this.carName = carName;
    }

    @Override
    public void steerRight() {
        super.steerRight();
    }

    @Override
    public void steerLeft() {
        super.steerLeft();
    }

    @Override
    public void changeGear(int gear) {
        super.changeGear(gear);
    }

    @Override
    public void accelerate(double speed) {
        super.accelerate(speed);
    }

    @Override
    public void breaking(double speed) {
        super.breaking(speed);
    }
}
