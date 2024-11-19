package Interfaces.MultipleInheritance;

interface MobilePhone {
    void call();
}

interface Camera {
    void open();
}

public class SmartPhone implements MobilePhone, Camera {
    @Override
    public void call() {
        System.out.println("Calling from MobilePhone");
    }

    @Override
    public void open() {
        System.out.println("Opening Camera");
    }

    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone();
        smartPhone.open();
        smartPhone.call();
    }
}
