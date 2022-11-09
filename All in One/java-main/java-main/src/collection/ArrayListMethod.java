package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethod {
    public static void main(String[] args) {
//        list1.addAll(list2);     // print all number in list1 and list2
//        list1.removeAll(list2);  // remove same element
//        list1.retainAll(list2);  //print common element

        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);

        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(4);
        list2.add(6);
        list2.add(8);

//        int j = list2.size()-1;
//        for (int i=0; i<=list1.size()-1;i++){
//            System.out.println(list1.get(i)* list2.get(j));
//            j--;
//        }
//        int i = list1.size()-1;
//        for (int j=list2.size()-1;j>=0;j--){
//            System.out.println(list2.get(j)*list1.get(i));
//            i--;
//        }
        int i=0;
        for (int j=list2.size()-1;i>=0;j--){
            System.out.println(list2.get(j)*list1.get(i));
            i++;
        }

      }
}
