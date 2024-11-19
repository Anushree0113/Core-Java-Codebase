package Polymorphism;

class A {
    void run() {
        System.out.println("A is running");
    }
}

class B extends A {

    @Override
    void run() {
        System.out.println("B is running");
    }
}

class C extends B {

    @Override
    void run() {
        System.out.println("C is running");
    }
}

public class RuntimePolymorphism {
    public static void main(String[] args) {
        A a = new B();
        a.run();

        A aa = new C();
        aa.run();

        A a1 = new A();
        a1.run();

    }
}
