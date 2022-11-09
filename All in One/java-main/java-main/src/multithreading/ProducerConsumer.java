package multithreading;

public class ProducerConsumer {     //InterThread communication
    int num;

    boolean flag = true;

    public synchronized void set(int num){      // synchronized helps to achieve communication between threads
        if (!flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("set:"+num);
        this.num = num;
        flag = false;
        notify();           //notify to all thread
    }
    public synchronized void get(){
        if (flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("get:"+num);
        this.num = num;
        flag = true;
        notify();
    }

}
class Producer implements Runnable{
    ProducerConsumer producerConsumer;     //reference variable

    public Producer(ProducerConsumer producerConsumer){  //constructor
        this.producerConsumer = producerConsumer;
        Thread t1 = new Thread(this);
        t1.start();
    }

    @Override
    public void run() {
        int num = 0;

        while (true){
            producerConsumer.set(num++);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
class Consumer implements Runnable{
    ProducerConsumer producerConsumer;

    public Consumer(ProducerConsumer producerConsumer){
        this.producerConsumer = producerConsumer;
         Thread t2 = new Thread(this);
         t2.start();
    }

    @Override
    public void run() {

        while (true) {
            producerConsumer.get();

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Main1{
    public static void main(String[] args) {
        ProducerConsumer producerConsumer = new ProducerConsumer();
        Producer producer = new Producer(producerConsumer);
        Consumer consumer = new Consumer(producerConsumer);

    }
}