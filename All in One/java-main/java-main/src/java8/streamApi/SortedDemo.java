package java8.streamApi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortedDemo {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(12,54,21,89,87);

        list.stream()
                .sorted(Collections.reverseOrder())
                .forEach(System.out::println);
    }
}
