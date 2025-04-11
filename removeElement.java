
class removeElement {
    public int removeElementSolution(int[] nums, int val) {

        int k = 0;
        // nums = [3, 2, 2, 3], val = 3
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }

        }
        return k;
    }

    public static void main(String[] args) {
        // Test case
        removeElement testCase = new removeElement();
        int[] nums1 = {3, 2, 2, 3};
        int[] nums2 = {3, 2, 2, 2};
        int[] nums3 = {3, 2, 2, 3, 4, 5};
        
        int val1 = 3;
        int val2 = 2;
        int val3 = 4;

        int result1 = testCase.removeElementSolution(nums1, val1);
        int result2 = testCase.removeElementSolution(nums2, val2);
        int result3 = testCase.removeElementSolution(nums3, val3);

        System.out.println("Result 1: " + result1); // Expected output: 2
        System.out.println("Result 2: " + result2); // Expected output: 3
        System.out.println("Result 3: " + result3); // Expected output: 5

        // Print the modified arrays
        System.out.print("Modified array 1: ");
        for (int i = 0; i < result1; i++) {
            System.out.print(nums1[i] + " ");
        }
        System.out.println();

        System.out.print("Modified array 2: ");
        for (int i = 0; i < result2; i++) {
            System.out.print(nums2[i] + " ");
        }
        System.out.println();

        System.out.print("Modified array 3: ");
        for (int i = 0; i < result3; i++) {
            System.out.print(nums3[i] + " ");
        }
        System.out.println();

    }

}

// nums = [3, 2, 2, 3], val = 3
// Iteration 1: k = 0, i = 0, nums = [3, 2, 2, 3]
// Iteration 2: k = 1, i = 1, nums = [2, 2, 2, 3]
// Iteration 3: k = 2, i = 2, nums = [2, 2, 2, 3]
// Iteration 4: k = 3, i = 3, nums = [2, 2, 2, 3]
// Final array: [2, 2, 2, 3], length = 2

// Time complexity: O(n)
// Space complexity: O(1)