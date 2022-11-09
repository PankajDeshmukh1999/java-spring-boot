package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambadaExpression {
    public static void main(String[] args) {
        MyInterface1 myInterface1=()-> {
            return "Hello";
        };
        System.out.println(myInterface1.msg());
//
        MyInterface2 myInterface2 =(int a, int b)->{
            return a+b;
        };
        System.out.println(myInterface2.add(3,5));
//
        List<Integer> list= Arrays.asList(11,12,13,134);

        Consumer<Integer> consumer= (i)->{
            System.out.println(i);
        };
        list.forEach(consumer);
    }

}

@FunctionalInterface
interface MyInterface1{
    String msg();
}

@FunctionalInterface
interface MyInterface2{
    int add(int a, int b);
}


//Lambada exp-> is anonymous function
// use-> it takes less code
//       it used to give implementation to function interface