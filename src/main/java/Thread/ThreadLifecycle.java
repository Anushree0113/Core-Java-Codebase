package Thread;

public class ThreadLifecycle extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadLifecycle tl = new ThreadLifecycle();
        System.out.println(tl.getState());

        tl.start();
        System.out.println(tl.getState());

        Thread.sleep(100);
        System.out.println(tl.getState());

        //join() -- Here main method will wait until tl finishes its work
        tl.join();
        System.out.println(tl.getState());
    }
}
