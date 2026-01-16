package java21.features;

import java.util.*;

public class Test {

    public static void main(String[] args) {

        // sequenced Collection example
        List<String> names = new ArrayList<>();
        names.add("Subrat");
        names.add("Rahul");
        names.add("Amit");
        System.out.println(names.getFirst());
        System.out.println(names.getLast());

        SequencedSet<String> cities = new LinkedHashSet<>();
        cities.add("Hyderabad");
        cities.add("Bangalore");
        cities.add("Chennai");
        System.out.println(cities.getFirst());
        System.out.println(cities.getLast());

        SequencedMap<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "Account");
        map.put(2, "Payment");
        map.put(3, "Fraud");
        System.out.println(map.firstEntry());
        System.out.println(map.lastEntry());

        List<Integer> nums = List.of(10, 20, 30);
        nums.reversed().forEach(System.out::println);

    }}
