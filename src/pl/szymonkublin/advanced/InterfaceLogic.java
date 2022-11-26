package pl.szymonkublin.advanced;

import pl.szymonkublin.advanced.interfaces.Car;
import pl.szymonkublin.advanced.interfaces.Driveable;
import pl.szymonkublin.advanced.interfaces.Train;

public class InterfaceLogic {
    public static void main(String[] args) {
        Car car = new Car();
        Train train = new Train();
        Driveable bike = () -> System.out.println("Dzyn, dzyn");

        justDrive(car, train, bike);
    }

    public static void justDrive(Driveable... driveableArray) {
        for (Driveable driveable : driveableArray) {
            System.out.println(driveable.getClass());
            driveable.drive();
            driveable.stop();
        }
    }
}
