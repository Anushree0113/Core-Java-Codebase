package Thread;

public class ThreadMethods2 extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " is running..");
            Thread.yield();
        }
    }

    public static void main(String[] args) {
        ThreadMethods2 t1 = new ThreadMethods2();
        ThreadMethods2 t2 = new ThreadMethods2();
        t1.start();
        t2.start();
    }
}
