package multithreading;

public class HiHelloDemo {

    public static void main(String[] args) throws InterruptedException {      //Another way for essy to  code

       Thread  t1 = new Thread(() ->{

            for (int i = 1; i<=5; i++){
                   System.out.println("Hi");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

       });
       Thread t2 = new Thread(() -> {

             for (int i = 1; i <= 5; i++){
                 System.out.println("Hello");
                 try {
                     Thread.sleep(500);
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }
             }

       });
       t1.start();
       t2.start();

       t1.join();
       t2.join();
        System.out.println("Exit");

    }
}
//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