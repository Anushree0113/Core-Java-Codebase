package leetcode.String;

public class CyclicRotationString
{
    public static void main(String[] args) {
        String p = "abfyg" ;
        String q = "gabfy";

        int ans = isCyclicRotation(p,q) ;
        System.out.println("ans = " + ans);
    }

    private static int isCyclicRotation(String p, String q) {
        String r = p + p ;
        if(r.contains(q))
            return 1 ;
        return 0 ;
    }
}
