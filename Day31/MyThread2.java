package Day31;

public class MyThread2 implements Runnable {
	public void run() {
		System.out.println("Hello from Runnable");
	}
	
	public static void main(String[] args) {
		MyThread2 thread2 = new MyThread2();
		Thread thread = new Thread(thread2);
		thread.start();
	}
}
