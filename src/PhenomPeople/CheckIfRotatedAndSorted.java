package PhenomPeople;

public class CheckIfRotatedAndSorted
{
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        boolean result = checkIfRotatedAndSortedArray(arr) ;
        System.out.println(result);
    }

    private static boolean checkIfRotatedAndSortedArray(int[] arr) {
        int count = 0 ;

        for(int i = 1 ; i < arr.length ; i++) {
            if(arr[i-1]> arr[i]) {
                count++;
            }
        }
        if(arr[arr.length-1] > arr [0]) {
            count++;
        }

        return count == 0  || count == 1 ;
    }
}
