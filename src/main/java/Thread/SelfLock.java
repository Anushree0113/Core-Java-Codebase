package Thread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SelfLock {

    private int balance = 100;

    private final Lock lock = new ReentrantLock();

    public void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw amount : " + amount);
        /*if (lock.tryLock()) {

        }*/
        try {
            if (lock.tryLock(1000, TimeUnit.MICROSECONDS)) {

                try {
                    if (balance >= amount) {
                        System.out.println(Thread.currentThread().getName() + " " + "processing with withdrawal");
                        try {
                            Thread.sleep(3000);
                        } catch (Exception e) {

                        }
                        balance -= amount;
                        System.out.println(Thread.currentThread().getName() + " " + "completed withdrawal from bank" + ". Remaining balance: " + balance);
                    } else {
                        System.out.println("Insufficient balance");
                    }

                } catch (Exception e) {
                    Thread.currentThread().interrupt();
                } finally {
                    lock.unlock();
                }
            } else {
                System.out.println(Thread.currentThread().getName() + " could not acquire lock");
            }
        } catch (Exception e) {
            Thread.currentThread().interrupt();
        }

    }
}
