package Thread;

class Pen {
    public synchronized void writeWithPenAndPaper(Paper paper) {
        System.out.println(Thread.currentThread().getName() + " is using pen " + this + " and trying to write ");
        paper.finishWriting();
    }

    public synchronized void finishWriting() {
        System.out.println(Thread.currentThread().getName() + " is finishing writing  using pen " + this);
    }
}

class Paper {

    public synchronized void writeWithPaperAndPen(Pen pen) {
        System.out.println(Thread.currentThread().getName() + " is using paper " + this + " and trying to write ");
        pen.finishWriting();
    }

    public synchronized void finishWriting() {
        System.out.println(Thread.currentThread().getName() + " is finishing writing  using paper " + this);
    }
}

class Task1 implements Runnable {
    private Pen pen1;
    private Paper paper1;

    public Task1(Pen pen1, Paper paper1) {
        this.pen1 = pen1;
        this.paper1 = paper1;
    }

    @Override
    public void run() {
        pen1.writeWithPenAndPaper(paper1);
    }
}

class Task2 implements Runnable {
    private Pen pen2;
    private Paper paper2;

    public Task2(Pen pen1, Paper paper2) {
        this.pen2 = pen1;
        this.paper2 = paper2;
    }

    @Override
    public void run() {
        paper2.writeWithPaperAndPen(pen2);
    }
}


public class DeadlockExample {
    public static void main(String[] args) {
        Pen pen = new Pen();
        Paper paper = new Paper();

        Thread t1 = new Thread(new Task1(pen, paper), "Thread1");
        Thread t2 = new Thread(new Task2(pen, paper), "Thread2");

        t1.start();
        t2.start();

    }
}
