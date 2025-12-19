import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortStringUsingStream {

    public static void main(String[] args) {

        String input = "Test1, T1, T3,T4, N4, A6, B5, B, C, A, 1, A5";
        List<String> sortedList = Arrays.stream(input.split(","))
                .map(String::trim)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sortedList);

    }
}
