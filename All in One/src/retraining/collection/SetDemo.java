package retraining.collection;

import java.util.HashSet;
import java.util.TreeSet;

public class SetDemo {		// unorderd 
	public static void main(String[] args) {
		
		HashSet<Integer> list = new HashSet<>();// not duplicate value store 
		list.add(10);
		list.add(10);
		list.add(null);
		
		System.out.println(list);
		
		TreeSet<String> list1 = new TreeSet<>(); // not null ,not duplicate,sort by asc order 
		list1.add("pankaj");
		list1.add("pankaj");
//		list1.add(null);
		System.out.println(list1);
	
	}

}
