package collection;

import java.util.ListIterator;
import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);

//        System.out.println(vector);
//        System.out.println(vector.hashCode());
//        System.out.println(vector.firstElement());
//        System.out.println(vector.lastElement());
//        System.out.println(vector.contains(20)); //check the element present or not

        System.out.println();//start from last index
        ListIterator<Integer> listIterator = vector.listIterator(vector.size());
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
    }
}
//all value of vector are synchronized
