package java8;

public class MethodRefToConstructor {
    public static void main(String[] args) {

        //refer
        MyInterface5 myInterface5 = MethodRefToConstructor :: new ;
        myInterface5.methodRef();
    }
    public MethodRefToConstructor(){
        System.out.println("In constructor");
    }
}
interface MyInterface5{
    MethodRefToConstructor methodRef();
}
