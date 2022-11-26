package pl.szymonkublin.basic;

import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args) {
        String str = null;

        if (str == null) {
            System.out.println("Text is null!");
        }

        if (str != null) {
            System.out.println("Text is: " + str);
        }

        boolean f = !true;
        boolean a = str != null;
        System.out.println(f);
        System.out.println(a);

        if(str == null && f) {
            System.out.println("AND");
        }

        if(str == null || f) {
            System.out.println("OR");
        }

        if(f || str == null) {
            System.out.println("OR #2");
        }

        if(f) {
            System.out.println("F is true");
        } else {
            System.out.println("F is false");
        }

        if(f) {
            System.out.println("F is true");
        }
        else if(str == null) {
            System.out.println("str is null, else doesn't matter");
        }
        else {
            System.out.println("F is false");
        }

        var t = 5;

        switch (t) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            default:
                System.out.println("Default");
        }

        Scanner scanner = new Scanner(System.in);
        int selected = scanner.nextInt();
        System.out.println(selected);

        switch (selected) {
            case 0 -> System.out.println("ZERO");
            case 1 -> System.out.println("ONE");
            case 2 -> System.out.println("TWO");
            default -> System.out.println("OTHER");
        }

        boolean even = switch (selected) {
            case 0 -> {
                System.out.println("ZERO");
                yield true;
            }
            case 1 -> {
                System.out.println("ONE");
                yield false;
            }
            case 2 -> {
                System.out.println("TWO");
                yield true;
            }
            default -> {
                System.out.println("OTHER");
                yield selected % 2 == 0;
            }
        };
        System.out.println(even);
        System.out.println("Number " + selected + " is " + (even ? "even" : "odd")); // short if statement
    }
}
