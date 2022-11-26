package pl.szymonkublin.advanced.interfaces;

public class Car implements Driveable{

    @Override
    public void drive() {
        System.out.println("Brum, brum");
    }
}
