package Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargest {

//    public static int secondLargest(int []a, int total){
//        Arrays.sort(a);
//        return a[total-2];
//    }
//
//    public static void main(String[] args) {
//        int [] a = {11,12,13,14};
//        System.out.println("Second Largest:"+secondLargest(a,4));
//    }
    public static int secondLargest(Integer[]a, int total){
        List<Integer> list = Arrays.asList(a);
        Collections.sort(list);
        int element  = list.get(total-2);
        return element;
    }

    public static void main(String[] args) {
        Integer a [] = {11,12,1,3,14,15};
        System.out.println("Second Largest:"+secondLargest(a,a.length));
    }
}
