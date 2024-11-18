package Thread;

class SharedResource {

    private int value;

    private boolean hasData;

    public synchronized void Produce(int value) {
        while (hasData) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        this.value = value;
        hasData = true;
        notify();
    }

    public synchronized int Consume(int value) {
        if (!hasData) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        hasData = false;
        notify();
        return value;
    }
}

class Producer implements Runnable {

    private SharedResource sharedResource;

    public Producer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            sharedResource.Produce(i);
            System.out.println("Produced = " + i);
        }

    }
}

class Consumer implements Runnable {

    private SharedResource sharedResource;

    public Consumer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            sharedResource.Consume(i);
            System.out.println("Consume = " + i);
        }
    }
}

public class ThreadCommunication {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
        Thread producer = new Thread(new Producer(sharedResource));
        Thread consumer = new Thread(new Consumer(sharedResource));

        producer.start();
        consumer.start();
    }
}
