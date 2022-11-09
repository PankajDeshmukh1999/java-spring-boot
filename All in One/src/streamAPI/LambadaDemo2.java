package streamAPI;

public class LambadaDemo2 {
	public static void main(String[] args) {
		L2 obj = (a,b)-> (a+b);{System.out.println("Addition of two numbers are:"+obj.add(22, 753));};
	}
}
interface L2{
	int add(int a, int b);
}