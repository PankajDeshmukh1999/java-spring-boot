package java8.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class PredicateDemo {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);

        Integer i = 8;

        Predicate<Integer> predicate = p-> p>5;
        System.out.println(predicate.test(i));

        Stream<Integer> stream = list.stream().filter(predicate);
        stream.forEach(System.out::println);

    }
}
