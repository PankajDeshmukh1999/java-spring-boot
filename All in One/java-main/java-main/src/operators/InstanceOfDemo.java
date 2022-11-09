package operators;

interface MyInterface{

}

public class InstanceOfDemo implements MyInterface {

    public void show() {
        System.out.println("In show");

    }

    public static void main(String[] args) {
        InstanceOfDemo obj = new InstanceOfDemo();
        if (obj instanceof MyInterface) {
            obj.show();
        }
    }
}

