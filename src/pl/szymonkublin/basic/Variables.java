package pl.szymonkublin.basic;

// some comment

/*
Multi-line comment.
 */

/** This is documentation. */

public class Variables {
    public static void main(String[] args) {
        System.out.println("Just text...");

        int age;
        age = 30;

        short height = 190;

        byte minByte = -128;

        float f = 1.12345F;
        double d = 1.1234567890;

        boolean b = true;
        char c = 'X';

        String s = "I'm string!";

        System.out.println(s);
        System.out.println(s + " " + f);

        int a = 7;
        int sum = a + 2;
        System.out.println(sum);

        double division = 2.1 / 0.5;
        System.out.println(division);

        // other basic math works the same :)

        int[] array = new int[50];

        System.out.println(array[25]);
        array[25] = 7;
        System.out.println(array[25]);

        String[] array2 = new String[10];
        System.out.println(array2[0]);

        char[] array3 = new char[]{'a', 'b', 'c'};
        System.out.println(array3[1]);
        array3[2] = 'z';
        System.out.println(array3[2]);

        String s1 = "text";
        var s2 = "text";

    }
}
