package leetcode.String;

public class AddString {
    public static void main(String[] args) {
        String num1 = "9";
        String num2 = "99";
        String value = addStrings(num1, num2);
        System.out.println("value = " + value);
    }

    private static String addStrings(String num1, String num2) {
        int sum = 0;
        int carry = 0;


        char[] arr1 = num1.toCharArray();
        char[] arr2 = num2.toCharArray();

        int i = arr1.length - 1;
        int j = arr2.length - 1;

        StringBuilder sb = new StringBuilder();

        while (i >= 0 && j >= 0) {
            int value1 = Integer.parseInt(String.valueOf(arr1[i]));
            int value2 = Integer.parseInt(String.valueOf(arr2[j]));
            sum += value1 + value2 + carry;
            carry = sum / 10;
            sum = sum % 10;
            sb.append(sum);
            i--;
            j--;
            sum = 0;
        }

        while (i >= 0) {
            sum = Integer.parseInt(String.valueOf(arr1[i])) + carry;
            carry = sum / 10;
            sum = sum % 10;
            sb.append(sum);
            i--;
        }

        while (j >= 0) {
            sum = Integer.parseInt(String.valueOf(arr2[j])) + carry;
            carry = sum / 10;
            sum = sum % 10;
            sb.append(sum);
            j--;
        }

        while (carry > 0) {
            sum += carry;
            sum = sum % 10;
            carry = sum / 10;
            sb.append(sum);
            carry--;
        }

        return sb.reverse().toString();
    }
}
