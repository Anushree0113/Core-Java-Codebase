package Thread;

import java.util.concurrent.*;

public class MyCallable implements Callable<Integer> {

    @Override
    public Integer call() {
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable myCallable = new MyCallable();
        try (ExecutorService service = Executors.newSingleThreadExecutor()) {
            Future<Integer> future = service.submit(myCallable);
            System.out.println(future.get());
        }
    }
}
