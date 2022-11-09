package collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(10);   //head
        queue.add(20);
        queue.add(30);
        queue.add(40);

        System.out.println(queue);
//        System.out.println(queue.offer(20));    //return boolean
//        System.out.println(queue.peek());       //return null
//        System.out.println(queue.poll());       //return null
//        System.out.println(queue.remove());     //return exception
//        System.out.println(queue.element());
    }
}
//Queue is  interface,FIFO
//double  ended queue means deque
