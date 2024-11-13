package leetcode.Array;

public class PlusOne {
    public static void main(String[] args) {

        int[] digits = {9, 9, 9};
        int[] arr = plusOne(digits);
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }

    private static int[] plusOne(int[] digits) {
        int i = digits.length - 1;
        int[] result = new int[digits.length + 1];
        for (; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;

        }

        result[0] = 1;

        return result;
    }
}
