package java8;

import java.util.ArrayList;
import java.util.List;

public class MethodReference {
    public static void main(String[] args) {
        //Method ref to instance method
        MethodReference obj = new MethodReference();
        //refer
        MyInterface3 myInterface3 = obj::msg;
        //call
        System.out.println(myInterface3.display());

        List<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(12);
        list.add(13);

        list.forEach(System.out::println);

    }
    public String msg(){
        return "Hello";
    }
}

interface MyInterface3{
    String display();
}
