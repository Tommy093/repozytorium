package pl.sdacademy.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("abcd");
        stringList.add("rerg");
        stringList.add("rthstrh");
        stringList.add("yukyuk");

        System.out.println("Zadanie 1");
        List<String> zadanie1 = stringList.stream()
                .filter(s -> s.length() > 3)
                .collect(Collectors.toList());
        System.out.println(zadanie1);

        System.out.println("Zadanie 2");
        List<String> zadanie2 = stringList.stream()
                .map(s -> s.substring(0 ,3))
                .collect(Collectors.toList());
        System.out.println(zadanie2);

        System.out.println("Zadanie 3");
        long zadanie3 = stringList.stream()
                .filter(s -> s.startsWith("A") && s.endsWith("A"))
                .count();
        System.out.println(zadanie3);

        System.out.println("Zadanie 4");
        List<String> zadanie4 = stringList.stream()
                .map(s -> s.substring(0, s.length() - 1))
                .filter(s -> s.length() >= 2)
                .collect(Collectors.toList());
        System.out.println(zadanie4);

        List<Person> people = new ArrayList<>();
        people.add(new Person("Aaaa", "Aaaa", 20, 1.80f, "abcd"));
        people.add(new Person("BBbbb", "Bbbb", 110, 2.80f, "abcd"));
        people.add(new Person("Aaaa", "Aaaa", 10, .80f, "abcd"));
        people.add(new Person("Aaaa", "Aaaa", 5, 1.25f, "abcd"));

        System.out.println("Zadanie 5");
        // zadanie 5
        people.stream()
                .filter(p -> p.getAge() > 20 || p.getHeight() > 1.75)
                .forEach(p -> System.out.println(p));

        System.out.println("Zadanie 6");
        List<String> zadanie6 = people.stream()
                .filter(p -> p.getAge() < 18)
                .map(p -> p.getName() + " " + p.getSurname())
                .collect(Collectors.toList());
        System.out.println(zadanie6);

    }


}
