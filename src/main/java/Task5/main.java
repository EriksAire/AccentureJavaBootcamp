package Task5;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        var car = new SpecificCar(0, 7, 250.0, 0,"BMW");
        car.changeGear(6);
        car.accelerate(220.0);
        car.steerRight();
        car.steerLeft();
        System.out.println(car);
    }
}
