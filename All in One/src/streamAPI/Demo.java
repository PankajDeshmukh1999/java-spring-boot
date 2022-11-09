package streamAPI;

import java.util.ArrayList;
import java.util.function.Function;

public class Demo {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(700);
		list.add(40);
		list.add(200);
		
		Function<Integer, Float> f = e-> e*e*1.2f;
		Function<Integer, Double> f1 = e-> e+e*2.2d;
		
		
		list.stream().filter(e-> e>20)
					 .map(f1)
					 .limit(2)
					 .sorted()
					 .forEach(e->System.out.println(e));;
	}

}
