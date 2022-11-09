package constructor;

public class ConstructorDemo {

    int  i=12;

    public ConstructorDemo(){
        System.out.println("In default constructor");
    }
    public ConstructorDemo(int i){
        System.out.println("In parameter constructor" +i);

    }

    public static void main(String[] args) {
        ConstructorDemo obj = new ConstructorDemo();
        ConstructorDemo obj1 = new ConstructorDemo( 23);
        System.out.println(obj.i);
    }
}
