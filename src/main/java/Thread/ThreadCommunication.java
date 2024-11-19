package Thread;

class SharedResource {

    public int getData() {
        return data;
    }

    private int data;

    private boolean hasData;

    public synchronized void Produce(int data) {
        while (hasData) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        this.data = data;
        hasData = true;
        notify();
    }

    public synchronized int Consume(int data) {
        if (!hasData) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        hasData = false;
        notify();
        return data;
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
            System.out.println("Produced " + sharedResource.getData());
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
            System.out.println("Consumed " + sharedResource.getData());
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
