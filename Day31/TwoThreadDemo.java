package Day31;

class MyThread3 extends Thread {
    private String threadName;

    public MyThread3(String name) {
        this.threadName = name;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class TwoThreadDemo {
    public static void main(String[] args) {
        MyThread3 t1 = new MyThread3("Thread 1");
        MyThread3 t2 = new MyThread3("Thread 2");

        t1.start();
        t2.start();
    }
}