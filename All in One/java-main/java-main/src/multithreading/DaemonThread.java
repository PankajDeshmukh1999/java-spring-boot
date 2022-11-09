package multithreading;

public class DaemonThread extends Thread{

    public static void main(String[] args) {

        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setDaemon(true);   //write before the start
        daemonThread.start();

        System.out.println(daemonThread.isDaemon());
        System.out.println("In main method");

    }

    @Override
    public void run() {
        System.out.println("In run method");
    }

}
