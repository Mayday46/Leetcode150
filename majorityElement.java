import java.util.HashMap;
import java.util.Map;

public class majorityElement {

    public int majorityElementSolution(int[] nums) {
        int maxValue = Integer.MIN_VALUE;
        Integer maxKey = null;

        Map<Integer, Integer> table = new HashMap<>();
        for (int digit : nums) {
            if (table.containsKey(digit)) {
                table.put(digit, table.get(digit) + 1);  // Fixed this line
            }
            else {
                table.put(digit, 1);
            }
        }
        
        for (Map.Entry<Integer, Integer> entry : table.entrySet()) {
            if (entry.getValue() != null && entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }

        return maxKey;
    }

    public static void main(String[] args) {
        majorityElement testCase = new majorityElement();
        int[] nums1 = {3, 2, 3};
        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};

        int result1 = testCase.majorityElementSolution(nums1);
        int result2 = testCase.majorityElementSolution(nums2);

        System.out.println("Result 1: " + result1); // Output: 3
        System.out.println("Result 2: " + result2); // Output: 2
    }
}
