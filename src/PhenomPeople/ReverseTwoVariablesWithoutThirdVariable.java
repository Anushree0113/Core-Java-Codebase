package PhenomPeople;

public class ReverseTwoVariablesWithoutThirdVariable {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        reverseVariable(a, b);

    }

    private static void reverseVariable(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
