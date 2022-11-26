package pl.szymonkublin.advanced;

import pl.szymonkublin.advanced.enums.DirectionEnum;
import pl.szymonkublin.advanced.enums.SimpleEnum;

public class EnumExamples {
    public static void main(String[] args) {
        System.out.println(SimpleEnum.OPTION_1);

        int angle = 10;
        if (angle < DirectionEnum.LEFT.getMaxAngle()) {
            System.out.println(DirectionEnum.LEFT);
        }
        else {
            System.out.println(DirectionEnum.RIGHT);
        }

        System.out.println(DirectionEnum.findDirection(45));
        System.out.println(DirectionEnum.findDirection(170));
        System.out.println(DirectionEnum.findDirection(-4));

        DirectionEnum.values();

    }
}
