package pl.szymonkublin.advanced.oop;

public class ComputerService {

    private ComputerModel computerModel;

    public ComputerService(ComputerModel computerModel) {
        this.computerModel = computerModel;
    }

    public void printComputerInfo() {
        System.out.println("Computer " + computerModel.getName() + " has " + computerModel.getAmountOfRam() + " RAM.");
    }
}
