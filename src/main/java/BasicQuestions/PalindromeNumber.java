package BasicQuestions;

public class PalindromeNumber {
    public static void main(String[] args) {
        int x = 121;
        boolean value = checkPalindrome(x);
        System.out.println("value = " + value);
    }

    private static boolean checkPalindrome(int x) {

        int temp = x;

        int ans = 0;

        while (temp > 0) {
            int remainder = temp % 10;
            ans = ans * 10 + remainder;
            temp /= 10;
        }
        if(ans == x)
            return true;

        return false;
    }
}
