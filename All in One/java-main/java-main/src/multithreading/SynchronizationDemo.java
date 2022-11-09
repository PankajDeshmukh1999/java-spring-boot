package multithreading;

public class SynchronizationDemo {
   int num;

   public  void increase(){
       synchronized (this) {            //synchronized block
           num++;
       }
   }

    public static void main(String[] args) throws InterruptedException {
        SynchronizationDemo obj = new SynchronizationDemo();

        Thread t1 = new Thread(()->{
           for (int i = 1; i<=1000;i++){
              obj.increase();
           }
        });
        Thread t2 = new Thread(()->{
           for (int i = 1; i<=1000; i++){
               obj.increase();
           }
        });
        t1.start();
        t1.join();   //stop the main thread

        t2.start();
        t2.join();

        System.out.println("num is:"+obj.num);

    }
}
