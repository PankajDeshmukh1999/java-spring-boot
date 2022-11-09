package java8;

public class MethodRefToStatic {
    public static void main(String[] args) { //refer method static
        //refer
        MyInterface4 myInterface4 = MethodRefToStatic::msg; //interface obj / class name /method name
        //call
        System.out.println(myInterface4.display());
    }
    public static String msg(){
        return "Hello";
    }
}
@FunctionalInterface
interface MyInterface4{
    String display();
}
