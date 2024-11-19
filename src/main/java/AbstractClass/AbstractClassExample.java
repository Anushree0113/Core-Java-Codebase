package AbstractClass;

abstract class Demo {
    public int getA() {
        return a;
    }

    private int a;

    public Demo(int value) {
        this.a = value;
    }

    abstract void show();
}

class Child extends Demo {


    public Child(int value) {
        super(value);
    }

    public void show() {
        System.out.println("Child show " + getA());
    }
}

public class AbstractClassExample {

    public static void main(String[] args) {
        Demo demo = new Child(1);
        demo.show();
    }

}
