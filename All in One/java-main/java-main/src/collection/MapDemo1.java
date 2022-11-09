package collection;

import java.util.*;

public class MapDemo1 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Pune");
        map.put(2,"Pune");
        map.put(3,"Pune");

        Map<Integer,String> map1 = new HashMap<>();
        map1.put(1,"Sangli");
        map1.put(2,"Kolhapur");
        map1.put(3,"Pune");

        Map<Integer,String> map2 = new HashMap<>();
        map2.put(1,"Sangli");
        map2.put(2,"Kolhapur");
        map2.put(3,"Pune");

        List<Map> list = new ArrayList<>();
        list.add(map);
        list.add(map1);
        list.add(map2);

//        list.forEach(s->{
//            s.forEach((k,v)->{
//                System.out.println("Key->"+ k + " Value->"+ v);
//            });
//        });

//        for (int i=0; i< list.size();i++){
//            for (Map.Entry<Integer,String> m: list.get(i).entrySet()){
//                System.out.println("Key->"+m.getKey()+ " Value->"+m.getValue());
//            }
//        }


    }
}
