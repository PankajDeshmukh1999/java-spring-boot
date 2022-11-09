package collection;

import java.util.Deque;
import java.util.Iterator;

public class ArrayDeque {
    public static void main(String[] args) {

        Deque<Integer> deque = new java.util.ArrayDeque<>();
        deque.add(10);
        deque.add(20);
        deque.add(30);
        deque.add(40);

        deque.offer(50);        //add element
//        System.out.println(deque.removeFirst());  //remove first element
//        System.out.println(deque.removeLast());   //remove last element
        deque.offerFirst(60);
//        System.out.println(deque.peek());
//        System.out.println(deque.poll());
//        System.out.println(deque.peekFirst());  //
//        System.out.println(deque.peekLast());

//        System.out.println(deque.pollFirst());
//        System.out.println(deque.pollLast());

//        Iterator<Integer> iterator = deque.iterator();  //showing op from first element
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
        System.out.println(deque);

        Iterator<Integer> iterator = deque.descendingIterator();  //showing op from last element
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
