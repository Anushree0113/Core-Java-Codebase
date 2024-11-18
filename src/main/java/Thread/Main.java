package Thread;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        SelfLock selfLock = new SelfLock();
        Runnable task = new Runnable() {
            @Override
            public void run() {
                selfLock.withdraw(50);
            }
        };
        Thread t1 = new Thread(task, "thread-1");
        Thread t2 = new Thread(task, "thread-2");
        t1.start();
        t2.start();
    }
}
