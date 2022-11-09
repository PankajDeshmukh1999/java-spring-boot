package streamAPI;

public class LambadaDemo {
	public static void main(String[] args) {
		InterfaceDemo obj = ()-> {System.out.println("Display");};
		obj.display();
	}
}

interface InterfaceDemo{
	void display();
}