package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeMap;

public class Array1 {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList();
		list.add("Red");
		list.add("Blue");
		list.add("Black");
		
		
		for (String string : list) {
			System.out.println("List:"+list);
		}
		
		
//		List<String> subList = list.subList(0, 2);
//		System.out.println("after sub"+subList);
//		
//		list.

//		list.add(0, "Yellow");
//		System.out.println(list);
//		
//		System.out.println(list.get(2));
//		
//		list.set(0, "pink");
		System.out.println("before:"+list);
		
		Collections.shuffle(list);
		
		System.out.println("After shuffle:"+list);
		
//		List<String> li = new ArrayList();
//		
//		li.add("1");
//		li.add("11");
//		li.add("111");
////		li.add("1111");
//		
//		Collections.copy(li, list);
//		System.out.println("After copy");
//		
//		System.out.println("List 1:"+ list);
//		System.out.println("List 2:"+li);
		
		
//		Collections.sort(list);
//		System.out.println(list);
		
		

		
		List<Integer> list1 = new ArrayList();
		list1.add(123);
		list1.add(13);
		list1.add(12);
//		System.out.println(list1.size());
//		System.out.println(list1.isEmpty());
//		System.out.println(list1.hashCode());
//		System.out.println(list1.toArray().toString());
		//
		
		
		
		
		
		
		
		
		HashSet<String> hl = new HashSet<>(); // cannot duplicate
		hl.addAll(list);
		for (String string : hl) {
			System.out.println("In hashSet:"+string);
		}
		
		
		

//		System.out.println(hl);
//		System.out.println(hl.remove(10));
//		System.out.println(hl.containsAll(hl));
		
		
		
		//
		
		
		
		
		
//		HashMap<Integer, String> hm = new HashMap<>();
//		hm.put(1,"Pankaj");
//		hm.put(2,"Pankaj");
//		hm.put(3,"Pankaj");
//
//		System.out.println(hm);
		
		HashMap<Integer, String> add = convertArrayListToHashMap(list);
		System.out.println("list is hashMap:"+add);
		TreeMap<Integer, String> hm = new TreeMap<>();
		hm.put(1,"Pankaj");
		hm.put(6,"Pankaj");
		hm.put(10,"Pankaj");
				
//		System.out.println(hm);
//		System.out.println(hm.ceilingEntry(7));// equal or greater then 
//		System.out.println(hm.floorKey(9));  // equal or less then
//		System.out.println(hm.higherKey(0));
//		System.out.println(hm.descendingMap());
//		System.out.println(hm.replace(1, "Pankaj", "pd"));
//		System.out.println(hm);
	}

	private static HashMap<Integer, String> convertArrayListToHashMap(List<String> list) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
		for (String string : list) {
			linkedHashMap.put(string.length(), string);
		}
		return linkedHashMap;
	}
}
