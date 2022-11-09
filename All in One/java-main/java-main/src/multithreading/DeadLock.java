package multithreading;

public class DeadLock {

    public static void main(String[] args) {
        String resource1 = "Printer";
        String resource2 = "Scanner";

        Thread t1 = new Thread(()->{
         synchronized (resource1){
             System.out.println(Thread.currentThread().getName()+" Locked "+resource1);
             try {
                 Thread.sleep(500);
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
             synchronized (resource2){
                 System.out.println(Thread.currentThread().getName()+" locked "+resource2);
             }
         }
        });
        Thread t2 = new Thread(()->{
           synchronized (resource2){
               System.out.println(Thread.currentThread().getName()+" Locked "+resource2);
               try {
                   Thread.sleep(500);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
           synchronized(resource1){
               System.out.println(Thread.currentThread().getName()+" Locked "+resource1);
           }
        });

        t1.setName("Laptop");
        t2.setName("Desktop");

        t1.start();
        t2.start();

    }

}
//both threads are waiting for each other to release the lock, the condition is called deadlock.