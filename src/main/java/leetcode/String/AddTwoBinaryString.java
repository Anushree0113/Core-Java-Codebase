package leetcode.String;

public class AddTwoBinaryString {
    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        String result = addBinary(a, b);
        System.out.println("result = " + result);
    }

    private static String addBinary(String a, String b) {
        char[] a1 = a.toCharArray();
        char[] b1 = b.toCharArray();

        int i = a1.length - 1;
        int j = b1.length - 1;

        int carry = 0;
        StringBuilder result = new StringBuilder();

        // Iterate while there are digits in either string or there's a carry
        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = carry; // Start with carry

            if (i >= 0) {
                sum += a1[i] - '0'; // Add the digit from string a
                i--;
            }

            if (j >= 0) {
                sum += b1[j] - '0'; // Add the digit from string b
                j--;
            }

            // Append the current bit (sum % 2)
            result.append(sum % 2);

            // Update carry (sum / 2)
            carry = sum / 2;
        }

        // Since we added the bits from right to left, reverse the result
        return result.reverse().toString();
    }
}
