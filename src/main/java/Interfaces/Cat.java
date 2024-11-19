package Interfaces;

public class Cat implements Animal {

    @Override
    public void eat() {
        System.out.println(" Cat eats");
    }

    @Override
    public void sleep() {
        System.out.println(" Cat Sleeps");
    }
}
