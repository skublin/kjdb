package pl.szymonkublin.advanced.interfaces;

public interface Driveable {

    void drive();

    default  void stop() {
        System.out.println("STOP!");
    }
}
