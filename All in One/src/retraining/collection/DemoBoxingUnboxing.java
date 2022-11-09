package retraining.collection;

public class DemoBoxingUnboxing {
	
	public static void main(String[] args) {
		int a= 10;
		String b = "Hello";
		//boxing
		Integer i = Integer.valueOf(a);
		System.out.println(a);
		
		String str = String.valueOf(b);
		System.out.println(str);
		
		//unboxing
		int i1= i.intValue();
	}

}
