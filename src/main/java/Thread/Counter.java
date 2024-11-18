package Thread;

public class Counter {

    public int getCount() {
        return count;
    }

    private int count;

    public synchronized void increment() {
        count++;
    }

}
