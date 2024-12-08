package EY_Interview;

import java.util.PriorityQueue;

public class KthSmallestElement {
    public static void main(String[] args) {
        int[] nums = {17, 7, 2, 30, 21};
        int k = 3;

        int element = findKthSmallest(nums, k);
        System.out.println("element = " + element);
    }

    private static int findKthSmallest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : nums) {
            pq.add(num);
        }
        int f = k - 1;
        while (f > 0) {
            pq.poll();
            f-- ;
        }
        return pq.peek();
    }
}
