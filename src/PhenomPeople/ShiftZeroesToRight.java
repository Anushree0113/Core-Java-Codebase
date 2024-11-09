package PhenomPeople;

public class ShiftZeroesToRight {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        shiftZero(arr);
    }

    private static void shiftZero(int[] arr) {
        int nonZeroIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];
            if (val != 0) {
                arr[i] = arr[nonZeroIndex];
                arr[nonZeroIndex] = val;
                nonZeroIndex++;
            }
        }

        //Printing sorted array
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
