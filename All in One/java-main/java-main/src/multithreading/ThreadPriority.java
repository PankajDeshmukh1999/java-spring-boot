package multithreading;

public class ThreadPriority {

    public static void main(String[] args) {
        A obj = new A();
        B obj1 = new B();

        obj.setPriority(1);
        obj1.setPriority(Thread.MAX_PRIORITY);       //1,5,10 are Normal,Medium and high priority

        obj.start();
        obj1.start();

    }
}
class A extends Thread{
    @Override
    public void run() {
        System.out.println("In run A");
    }
}
class B extends Thread{
    @Override
    public void run() {
        System.out.println("In run B");
    }
}
