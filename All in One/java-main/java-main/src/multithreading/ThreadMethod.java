package multithreading;

public class ThreadMethod {

    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName());
//        System.out.println(Thread.currentThread().isAlive());

        Thread t1 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
        });
//        t1.setName("T-1");                  // setName for the set our thread name.
//        System.out.println(t1.getId());     // random id from java
          System.out.println(t1.isDaemon());  // test thread is demon or not  (boolean) or warn you(worker thread)
          t1.setDaemon(true);
//        System.out.println(t1.getState());
        t1.start();                             // start the execution of tread using start method

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(t1.isAlive());

    }
}
