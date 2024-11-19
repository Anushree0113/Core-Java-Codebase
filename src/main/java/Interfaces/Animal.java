package Interfaces;

public interface Animal {

    int maxAge = 150;

    void eat();

    void sleep();

    static void run() {
        System.out.println("Animal is running");
    }

    default void show() {
        System.out.println("Animal is showing");
    }

}
