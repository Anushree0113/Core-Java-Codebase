package PhenomPeople;

import java.util.ArrayList;

public class Sort012 {
    public static void main(String[] args) {
        ArrayList<Integer> arr =  new ArrayList<>();
        arr.add(2);
        arr.add(0);
        arr.add(2);
        arr.add(1);
        arr.add(1);
        arr.add(0);

        sortArrayList(arr) ;
    }

    private static void sortArrayList(ArrayList<Integer> arr) {

        //Following Dutch National Flag Algorithm
        int low = 0 ;
        int mid = 0 ;
        int high = arr.size() - 1 ;

        while (mid <= high) {

            int value = arr.get(mid) ;

            // if value = 0 - > swap (low , mid) ; low++ , mid++
            if(value == 0)
            {
                int temp = arr.get(low) ;
                arr.set(low, arr.get(mid)) ;
                arr.set(mid, temp) ;
                low++ ;
                mid++ ;
            }

            //if value == 1 ; mid++
            else if(value == 1)
            {
                mid++ ;
            }

            // if value == 2 ; swap (mid , high) ; high-- , mid++ ;
            else
            {
                int temp = arr.get(mid) ;
                arr.set(mid , arr.get(high)) ;
                arr.set(high , temp) ;
                mid++ ;
                high-- ;
            }
        }

        //Printing sorted array
        for(int val : arr)
        {
            System.out.print(val + " ") ;
        }

    }
}
