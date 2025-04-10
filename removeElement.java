
class removeElement {
    public int removeElementSolution(int[] nums, int val) {

        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}

// nums = [3,2,2,3], val = 3
// Iteration 1: k = 0, i = 0, nums[i] = 3
// Iteration 2: nums[1] = 2, nums[1] != 3, nums[0] = 2 => nums[1] = 2, k = 1, [2, 2, 2, 3]
// Iteration 3: nums[2] = 2, nums[2] != 3, nums[1] = 2 => nums[2] = 2, k = 2, [2, 2, 2, 3]
// Iteration 4: nums[3] = 3, nums[3] == 3, k = 2
// Final array: [2, 2, 2, 3], length = 2
// Time complexity: O(n)
// Space complexity: O(1)