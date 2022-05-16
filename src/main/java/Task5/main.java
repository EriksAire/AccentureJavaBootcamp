package Task5;

import org.apache.log4j.Logger;

public class main {
    private static final Logger logger = Logger.getLogger(main.class);
    public static void main(String[] args) {

        try {
            var car = new SpecificCar(0, 7, 250.0, 0, "BMW");
            car.changeGear(6);
            car.accelerate(220.0);
            car.steerRight();
            car.steerLeft();
            System.out.println(car);
        }catch (Exception e){
            logger.error(e);
        }
    }
}
