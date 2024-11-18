package Thread;

class A extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}

public class ThreadCreation {

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {

            System.out.println(Thread.currentThread().getName());
        }
        Thread t1 = new A();
        t1.start();
    }
}
