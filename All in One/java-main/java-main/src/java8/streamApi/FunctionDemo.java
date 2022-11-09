package java8.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.IntStream;

public class FunctionDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);

        Integer i = 8;

        Function<Integer,Integer> function = (integer) ->{
            if (integer >5);
            return integer;
        } ;

        Function<Integer,Integer> function1 = f-> f*2;

        System.out.println(function.andThen(function1).apply(i));

        Integer maximum = 0;
        for (int j=0;  j< list.size(); j++){
            if (maximum < list.get(j)){
                maximum = list.get(j);

            }
        }
        System.out.println(maximum);



    }
}
