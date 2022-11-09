package retraining.collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListDemo {
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>(); // for sorting 
		list.add(10);
		list.add(20);
		
		for (Integer integer : list) {
			System.out.println(integer);
		}
		
		LinkedList<String> ls= new LinkedList<>(); //for manipulation
		ls.add("Gold");
		ls.add("Silver");
		
		for(String i : ls) {
			System.out.println(i);
		}
		
	}

}
