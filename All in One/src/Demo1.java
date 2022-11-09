interface MyInterface {
    public void method1();
    public void method2();
}

class MyClass implements MyInterface {
    public void method1() {
        System.out.println( "method 1" );
    }

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}
}

public class Demo1 {
    public static void main( String args[] ) {
        MyClass c1 = new MyClass();
        c1.method1();
        c1.method2();
    }
}