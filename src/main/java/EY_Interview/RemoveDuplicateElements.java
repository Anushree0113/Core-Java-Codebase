package EY_Interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 3, 4, 5};
        List<Integer> uniqueList = removeDuplicateElement(nums);
        for (int i : uniqueList)
            System.out.print(i + " ");
    }

    private static List<Integer> removeDuplicateElement(int[] nums) {
        List<Integer> output = Arrays.stream(nums).boxed().distinct().collect(Collectors.toList());
        return output;
    }
}
