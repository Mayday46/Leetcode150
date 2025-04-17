public class countEqualandDivisiblePairsinanArray {
    
    public int countEqualandDivisiblePairsinanArraySolution(int[] nums, int k) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j] && (i * j) % k == 0) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        // Test case
        countEqualandDivisiblePairsinanArray testCase = new countEqualandDivisiblePairsinanArray();
        int[] nums1 = {3, 1, 2, 2, 2, 1, 3};
        int[] nums2 = {1, 2, 3, 4};
        int[] nums3 = {1, 1, 1, 1};
        
        int k1 = 2;
        int k2 = 3;
        int k3 = 4;

        int result1 = testCase.countEqualandDivisiblePairsinanArraySolution(nums1, k1);
        int result2 = testCase.countEqualandDivisiblePairsinanArraySolution(nums2, k2);
        int result3 = testCase.countEqualandDivisiblePairsinanArraySolution(nums3, k3);

        System.out.println("Result 1: " + result1); // Expected output: 4
        System.out.println("Result 2: " + result2); // Expected output: 0
        System.out.println("Result 3: " + result3); // Expected output: 6
    }
}
