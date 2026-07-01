package Day31;

public class MyThread extends Thread {
	public void run() {
		System.out.println("Hello from Thread");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread thread = new MyThread();
		thread.start();
	}
}
