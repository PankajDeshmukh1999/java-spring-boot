package retraining;

public class ExceptionDemo {
	public static void main(String[] args) {
		System.out.println("Hello 1");
		try {
		int a= 10/0;
		}catch (ArithmeticException e) {
			System.out.println("arithmatic exception");
		}
//		System.out.println(a);
		System.out.println("Hello 2");
	}

}
