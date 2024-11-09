package PhenomPeople;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int result = removeDuplicate(arr);
        //printing output array
        for (int i = 0; i < result; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static int removeDuplicate(int[] arr) {

        int i = 0;

        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                arr[i + 1] = arr[j];
                i++;
            }
        }

        return i + 1;
    }
}
