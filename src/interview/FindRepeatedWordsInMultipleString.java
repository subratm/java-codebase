package interview;

import java.util.Arrays;
import java.util.List;

public class FindRepeatedWordsInMultipleString {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello world hello","world of Java","hello Java","hello world of Java");
        long count = list.stream().flatMap(s -> Arrays.stream(s.split("\\s"))) // means Any whitespace (space, tab, newline)
                .filter(w -> w.equalsIgnoreCase("world"))
                .count();
        System.out.println(count);
    }
}
