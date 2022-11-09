package collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class Book implements Comparable<Book> {
    int id;
    String name,author,publisher;
    int quantity;

    public Book(int id,String name, String author,String publisher,int quantity){
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;

        System.out.println("Id->"+id+ " Book Name->"+name+" Book Author"+author+" Publisher->"+publisher+"quantity->"+quantity);
    }
    public int compareTo(Book b){
        if (id>b.id){
            return 1;
        }else if (id< b.id){
            return -1;
        }else{
            return  0;
        }
    }
}
class LinkedListDemo1{
    public static void main(String[] args) {
        Queue<Book> queue = new PriorityQueue<>();
        Book book = new Book(1,"Stat","paul","Arihant",10);
        Book book1 = new Book(1,"Maths","Max","TechGuru",20);
        Book book2 = new Book(1,"Java","Allaudin","Allaudin",30);

        queue.add(book);
        queue.add(book1);
        queue.add(book2);

        for (Book b:queue){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
        queue.remove();    //remove the head (1st element)
        System.out.println("After removing");
        for (Book b:queue){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }

    }
}
