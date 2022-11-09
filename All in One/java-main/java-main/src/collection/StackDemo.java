package collection;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {

//        Stack<Integer> stack = new Stack<>();
//        stack.add(10);
//        stack.add(20);
//        stack.add(30);
//        stack.add(40);  //head
//
//        System.out.println(stack.peek());  //show head of the stack(push)
//        System.out.println(stack.pop());   // remove head of the stack
//        System.out.println(stack.search(Integer.valueOf(10)));
//        System.out.println(stack);

        Stack<String> stack = new Stack<>();
        stack.add("Dog");
        stack.add("cat");
        stack.add("Fox");
        stack.add("Tiger");

        System.out.println(stack);
        System.out.println(stack.remove(3));

    }
}
//first in last out
