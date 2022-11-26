package pl.szymonkublin.advanced.interfaces;

public class Train implements Driveable{

    @Override
    public void drive() {
        System.out.println("Ciu, Ciuuu!");
    }

    @Override
    public void stop() {
        System.out.println("Hamowanie!");
    }
}
