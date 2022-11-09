package collection;

import java.util.*;

public class CountInteger {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,0,1,0,0,0,0,1);
        Map<Integer,Integer> map = new HashMap<>();

        for (Integer integer : list){
            if (map.containsKey(integer)){
                map.put(integer, map.get(integer)+1);
            }
            else{
                map.put(integer,1);
            }
        }
        System.out.println(map);
    }
}
