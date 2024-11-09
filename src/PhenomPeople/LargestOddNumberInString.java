package PhenomPeople;

public class LargestOddNumberInString {
    public static void main(String[] args) {
        String str = "534";
         String result = getLargestOdd (str) ;
        System.out.println("result = " + result);
    }

    private static String getLargestOdd(String str) {
        for(int i = str.length() - 1 ; i >= 0 ; i--) {
            char value = str.charAt(i);
            if(value % 2 != 0) {
                System.out.println(str.substring(0 , i+1));
                return str.substring(0 , i+1) ;
            }
        }

        return "" ;
    }
}
