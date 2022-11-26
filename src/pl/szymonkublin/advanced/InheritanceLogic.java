package pl.szymonkublin.advanced;

import pl.szymonkublin.advanced.inheritance.NumberInputField;
import pl.szymonkublin.advanced.inheritance.TextInputField;

public class InheritanceLogic {
    public static void main(String[] args) {
        TextInputField textInputField = new TextInputField(0);
        textInputField.setName("Text input 1");
        textInputField.enterData("Text 1");
        NumberInputField numberInputField = new NumberInputField(1);
        numberInputField.setName("Number input 1");
        numberInputField.enterData(123);

        System.out.println(textInputField.getId());
        System.out.println(textInputField.getName());
        System.out.println(textInputField.getValue());
        System.out.println(numberInputField.getId());
        System.out.println(numberInputField.getName());
        System.out.println(numberInputField.getValue());
        System.out.println(numberInputField.isEven());
        textInputField.printFieldInfo();

//        InputField inputField = new InputField(5);

    }
}
