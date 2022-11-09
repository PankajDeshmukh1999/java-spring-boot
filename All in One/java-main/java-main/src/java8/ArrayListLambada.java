package java8;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class ArrayListLambada {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(11,12,13,34,31);
        AtomicInteger sum = new AtomicInteger(0);
//        int result = 0;
//        for (int i=0; i<list.size(); i++){
//            result = result+ list.get(i);
//        }
//        System.out.println(result);

        list.forEach(s->{
            sum.set(sum.get()+s);
        });
        System.out.println(sum);

    }
}
