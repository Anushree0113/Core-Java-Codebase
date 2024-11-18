package Thread;

public class ThreadMethods extends Thread {

    //2nd method -- run()
    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            try {
                //5th method -- getPriority() & setPriority()
                Thread.currentThread().setPriority(Thread.MIN_PRIORITY);

                //3rd method -- sleep()
                Thread.sleep(1000);
                System.out.println("Thread is running ...");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new ThreadMethods();

        //first method
        t1.start();

        //4th method
        t1.join();
        System.out.println("Hi");

        //6th method
        t1.interrupt();

    }
}
