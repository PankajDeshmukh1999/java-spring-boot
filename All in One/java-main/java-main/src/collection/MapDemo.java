package collection;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Pune");
        map.put(2,"Mumbai");
        map.put(3,"Sangli");
//
//        map.forEach((k,v)->{              //for each loop
//            System.out.println("Key->"+k+ " Value->"+v);
//        });

        for (Map.Entry<Integer,String> m: map.entrySet()){  //enhanced for loop
            System.out.println("Key->"+m.getKey()+ " Value->"+m.getValue());
        }
    }
}
//key is unique,it cannot be duplicate
