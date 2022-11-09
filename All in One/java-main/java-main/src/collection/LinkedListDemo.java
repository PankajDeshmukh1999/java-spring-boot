package collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println(list);
        System.out.println(list.isEmpty());
        System.out.println(list.contains(40));  //check value present list ture/false
        System.out.println(list.remove(3)); //remove
        System.out.println(list.indexOf(10));// check the index of element
        System.out.println(list.size());
        System.out.println(list.get(1));
        System.out.println(list.set(2,50));

    }
}
/**
 * LinkedList store duplicate values.
 *     ""       maintain insertion order.
 * It used double LinkedList to store element
 */
