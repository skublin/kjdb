package pl.szymonkublin.basic;

public class Methods {

    public static void main(String[] args) {
        printName("Adam");
        printName("Ewa");

        int count1 = countA(new char[]{'a', 'A', 'z', 'B', 'a'});
        int count2 = countA(new char[]{'z', 'B', 'x'});
        int count3 = countA(new char[]{' '});
        System.out.println(count1 + " / " + count2 + " / " + count3);

        printNameAndAge("Szymon", 25);
        printNameAndAge("Andrzej", 1);
        printNameAndAge("Jagoda", 3);
    }

    private static void printName(String name) {
        System.out.println("You're " + name);
    }

    private static int countA(char[] chars) {
        int count = 0;

        for (char c : chars) {
            if (c == 'a' || c == 'A') {
                count++;
            }
        }

        return count;
    }

    private static void printNameAndAge(String name, int age) {
        String str = "You're " + name + " and ";

        if (age == 1) {
            str += "one yo";
        }
        else if (age < 4) {
            str += age + " yo, child";
        }
        else {
            str += age + " yo, oldie";
        }

        System.out.println(str);
    }
}
