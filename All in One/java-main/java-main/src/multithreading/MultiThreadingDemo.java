package multithreading;

public class MultiThreadingDemo extends Thread {

    @Override
    public void run() {
        for (int i =1;i<=5;i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(500);     //Stop the execution for 500 millis
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}
class Hello implements Runnable{

    @Override
    public void run() {
        for (int i = 1;i<=5;i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Main{
    public static void main(String[] args) {
        MultiThreadingDemo obj = new MultiThreadingDemo();
        obj.start();                        //because multiThreading

        Hello hello = new Hello();
        Thread t1 = new Thread(hello);
        //Runnable
        t1.run();
        t1.run();
        t1.start();
    }
}
