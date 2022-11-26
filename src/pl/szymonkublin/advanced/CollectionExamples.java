package pl.szymonkublin.advanced;

import pl.szymonkublin.advanced.inheritance.BooleanInputField;
import pl.szymonkublin.advanced.inheritance.TextInputField;

import java.util.*;

public class CollectionExamples {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("text1");
        list.add("text2");
        list.add("text3");
        list.add("text4");

        list.remove(2);

        System.out.println(list);

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(1);

        System.out.println(set);

        for (String str : list) {
            System.out.println(str);
        }

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "one");
        map.put(2, "two");
        System.out.println(map);

        pl.szymonkublin.advanced.mycollection.HashMap myHashMap = new pl.szymonkublin.advanced.mycollection.HashMap();

        BooleanInputField booleanInputField = new BooleanInputField(1);
        booleanInputField.enterData(true);

        List<TextInputField> fields = new ArrayList<>();
        fields.add(new TextInputField(2));
        fields.add(new TextInputField(1));
        fields.add(new TextInputField(3));
        System.out.println(fields);

        Collections.sort(fields);
        System.out.println(fields);

        list.add("text3");
        list.add("text4");

        List<String> result1 = new ArrayList<>();

        for (String str : list) {
            if (str.startsWith("t") && str.endsWith("4")) {
                result1.add(str);
            }
        }

        System.out.println(result1);

        List<String> result2 = list.stream()
                .filter(s -> s.startsWith("t"))
                .filter(s -> s.endsWith("4"))
                .toList();

        System.out.println(result2);

        List<String> result3 = list.stream()
                .map(String::toUpperCase)
                .toList();

        Optional<String> optional = list.stream()
                .filter(s -> s.startsWith("t"))
                .findAny();

        optional.ifPresent(System.out::println);

    }
}
