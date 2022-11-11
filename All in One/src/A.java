
public class A {
	A(){
		System.out.println("Form a");
	}
}
 class B extends A{
	B(int z){
		z=2;
	}
	public static void main(String[] args) {
		new B(2);
	}
}
