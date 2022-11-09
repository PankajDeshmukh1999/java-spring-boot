package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println(list);
        System.out.println(list.contains(40)); //return boolean value
//        System.out.println(list.remove(3)); remove
        System.out.println(list.indexOf(10));// check the index of element
        System.out.println(list.size());
        System.out.println(list.get(1));
        System.out.println(list.set(3,50)); // add

        list.forEach(s->{
            System.out.println(s);
        });

//        Iterator<Integer> iterator = list.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//
//        List<Integer> list1 = Arrays.asList(10,20,30,40,50);
//
//        List<Integer> list2 = new ArrayList<>(List.of(10,30,52,80));
//
//        List<Integer> list3 = new ArrayList<>(){{
//           add(22);
//           add(21);
//           add(20);
//        }};
//        List<Integer> list4 = new ArrayList<>(Arrays.asList(12,32,45,76));
    }

}
/**
 * Array list is slow because of bit shifting
 * By default <Integer> are 10 after 10 it increases with 50%
 * Array list contains duplicate value
 * Array list grow automatically
 * ArrayList maintain insertion order
 * ArrayList store dynamic
 */
