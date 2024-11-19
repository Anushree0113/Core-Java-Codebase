package Interfaces;

public class Test {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        Cat c = new Cat();
        /*System.out.println(Dog.maxAge);*/
        System.out.println(Animal.maxAge);
        Animal.run(); // static method
        d.show(); // default method
        c.show(); //default method

    }
}
