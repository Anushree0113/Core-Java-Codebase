package EY_Interview;

public class AddTwoNumber {
    public static void main(String[] args) {
        int[] nums1 = {2, 4, 3};
        int[] nums2 = {5, 6, 4};

        char[] sum = addTwoNumber(nums1, nums2);
        for (int i = 0; i < sum.length; i++)
            System.out.print(sum[i] + " ");
    }

    private static char[] addTwoNumber(int[] nums1, int[] nums2) {
        int sum;
        int carry = 0;

        StringBuilder stringBuilder = new StringBuilder();

        int i = nums1.length - 1;
        int j = nums2.length - 1;

        while (i >= 0 && j >= 0) {
            sum = nums1[i] + nums2[j] + carry;
            carry = sum / 10;
            sum = sum % 10;
            stringBuilder.append(sum);
            i--;
            j--;
        }

        while (i >= 0) {
            sum = nums1[i] + carry;
            carry = sum / 10;
            sum = sum % 10;
            stringBuilder.append(sum);
            i--;
        }
        while (j >= 0) {
            sum = nums2[j] + carry;
            carry = sum / 10;
            sum = sum % 10;
            stringBuilder.append(sum);
            j--;
        }

        while (carry > 0) {
            sum = carry;
            stringBuilder.append(sum);
            carry--;
        }

        return stringBuilder.reverse().toString().toCharArray();
    }
}
