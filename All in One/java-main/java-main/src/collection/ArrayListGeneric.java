package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListGeneric {
    public static void main(String[] args) {  //2 arraylist call in one obj
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        iterate(list);

        List<Integer> list1 = new ArrayList<>();
        list1.add(4);
        list1.add(5);
        list1.add(6);

        iterate(list1);

    }
    public static void iterate(List<?> list){
        list.forEach(s->{
            System.out.println(s);
        });
    }
}
//Generic (?) it means any type
