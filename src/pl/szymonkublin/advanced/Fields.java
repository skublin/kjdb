package pl.szymonkublin.advanced;

import pl.szymonkublin.advanced.oop.ComputerModel;
import pl.szymonkublin.advanced.oop.ComputerService;
import pl.szymonkublin.advanced.util.StringUtil;

public class Fields {

    public static void main(String[] args) {
        ComputerModel computerModel1 = new ComputerModel();
        System.out.println(computerModel1);
        computerModel1.setName("Gemini");
        computerModel1.setAmountOfRam(32);
        System.out.println(computerModel1.getName());
        System.out.println(computerModel1.getAmountOfRam());

        ComputerModel computerModel2 = new ComputerModel("Fujitsu");
        System.out.println(computerModel2.getName());
        System.out.println(computerModel2.getAmountOfRam());

        ComputerService computerService = new ComputerService(computerModel1);
        computerService.printComputerInfo();

//        StringUtil stringUtil = new StringUtil();

        String result = StringUtil.concatenateChars(new char[]{'z', 'a', 'g', 'a', 'd', 'k', 'a'});
        System.out.println(result);

        Integer i = 4;
        Double d = 4.5;
        System.out.println(d.byteValue());
    }
}
