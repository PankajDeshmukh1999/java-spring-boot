package collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<String>();  // sort bye ascending order
        treeSet.add("Pankaj");
        treeSet.add("Kiran");
        treeSet.add("Suraj");
        treeSet.add("Nitish");

//        System.out.println(treeSet);
        System.out.println("Subset"+ treeSet.subSet("P","k"));
    }

}
