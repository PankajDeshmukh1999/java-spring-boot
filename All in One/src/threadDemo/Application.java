package threadDemo;

public class Application extends Thread {

	@Override
	public void run() {
//		System.out.println(MAX_PRIORITY);
//		System.out.println(getName()+" Demo");
//		System.out.println(getId());
//		System.out.println(isAlive());
//		System.out.println(isDaemon());

		System.out.println();
		for (int i = 0; i < 3; i++) {
			System.out.println("thread......");
			try {
				sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {

		Application t1 = new Application();
		t1.start();

		Typing typing = new Typing();
		Thread t2 = new Thread(typing);
		t2.start();

		Grammer grammer = new Grammer();
		Thread t3 = new Thread(grammer);
		t3.start();

		SaveDocument document = new SaveDocument();
		Thread t4 = new Thread(document);
		t4.start();
	}

}
