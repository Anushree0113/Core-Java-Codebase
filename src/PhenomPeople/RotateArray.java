package PhenomPeople;

public class RotateArray
{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7}  ;
        int k = 2 ;

        rotateArrayByKElements(arr,k) ;
    }

    private static void rotateArrayByKElements(int[] arr, int k) {

        int[] newArr = new int[arr.length];

        for(int i = 0 ; i < arr.length ; i++){
            newArr[(i+k)%arr.length] = arr[i];
        }

        //printing new array
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(newArr[i]+" ");
        }
    }
}
