package pl.szymonkublin.advanced;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExamples {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int i = scanner.nextInt();
            System.out.println(5 / i);
        }
        catch (InputMismatchException e) {
            System.out.println("Input problem!");
            e.printStackTrace();
        }
        catch (ArithmeticException e) {
            System.out.println("Zero division");
            e.printStackTrace();
        }
        finally {
            System.out.println("Finally always");
        }

        throw new ArrayIndexOutOfBoundsException("Problem with array!");

    }
}
