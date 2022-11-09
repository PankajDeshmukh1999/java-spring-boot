package collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);

        Set<Integer> set1 = new HashSet<>();
        set1.add(10);
        set1.add(20);
        set1.add(70);

        set1.containsAll(set);
        System.out.println(set1);

        Set<Integer> set2 = new TreeSet<>();
        set2.add(40);
        set2.add(30);
        set2.add(400);
        set2.add(410);

        System.out.println(set2);

    }
}
// cannot contain duplicate value
