package PhenomPeople;

public class checkPalindromString {
    public static void main(String[] args) {
        String s1 = "aba";
        boolean result  = checkIsItPalindrome(s1) ;
        System.out.println("result = " + result);
    }

    private static boolean checkIsItPalindrome(String s1) {
        int low = 0 ;
        int high = s1.length() - 1 ;
        while (low < high) {
            if (s1.charAt(low) != s1.charAt(high)) {
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
}
