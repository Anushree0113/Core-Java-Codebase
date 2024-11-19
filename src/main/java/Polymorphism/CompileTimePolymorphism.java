package Polymorphism;

class Addition {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class CompileTimePolymorphism {
    public static void main(String[] args) {
        Addition add = new Addition();
        System.out.println(add.add(10, 20));
        System.out.println(add.add(10, 20, 30));
    }
}
