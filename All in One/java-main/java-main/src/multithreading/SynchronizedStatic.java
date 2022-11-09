package multithreading;

public class SynchronizedStatic {

    static int num;

    public static void increase(){
        synchronized (SynchronizedStatic.class) {
            num++;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        SynchronizedStatic obj = new SynchronizedStatic();
        SynchronizedStatic obj1 = new SynchronizedStatic();

        Thread t1 = new Thread(()->{
           for (int i = 1; i<=1000; i++){
               increase();
           }
        });
        Thread t2 = new Thread(()->{
           for (int i = 1; i <= 1000; i++){
               increase();
           }
        });
        Thread t3 = new Thread(()->{
           for (int i =1; i<=1000; i++){
               increase();
           }
        });
        Thread t4 = new Thread(()->{
           for (int i =1; i<=1000; i++){
               increase();
           }
        });
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();

        System.out.println("num="+num);
    }
}
