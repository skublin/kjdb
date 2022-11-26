package pl.szymonkublin.advanced;

import pl.szymonkublin.advanced.oop.ComputerModel;

public class ObjectLogic {
    public static void main(String[] args) {
        ComputerModel computerModel1 = new ComputerModel("Apple");
        ComputerModel computerModel2 = new ComputerModel("Apple");

        if (computerModel1 == computerModel2) {
            System.out.println("Same ones");
        }

        if (computerModel1.equals(computerModel2)) {
            System.out.println("Same computers");
        }

        System.out.println(computerModel1);    // use ComputerModel's method toString
    }
}
