package Thread;

public class BankAccount {
    private int balance = 100;

    public synchronized  void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " " + "Withdrawing " + amount + " from bank");
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " " + "processing with withdrawal");
            try {
                Thread.sleep(10000);
            } catch (Exception e) {

            }
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " " + "completed withdrawal from bank" + ". Remaining balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " " + "Insufficient balance");
        }
    }
}
