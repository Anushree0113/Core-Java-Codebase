package PhenomPeople;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {6, 7, 1, 2, 3, 4, 5};
        int search_element = 1;

        int result = elementSearch(arr, search_element);
        System.out.println(result);
    }

   // searching in a rotated-sorted array using binary search
    private static int elementSearch(int[] arr, int searchElement) {
        int low = 0, high = arr.length - 1;
        int mid = low + (high - low) / 2;
        while (low <= high) {
            if (arr[mid] == searchElement) {
                return mid;
            }

            if (arr[low] < arr[mid]) {
                if (arr[low] <= searchElement && searchElement < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (searchElement > arr[mid] && searchElement <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }

            mid = low + (high - low) / 2;

        }
        return -1;
    }
}
