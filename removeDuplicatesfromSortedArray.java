

public class removeDuplicatesfromSortedArray {

    public int removeDuplicates(int[] nums) {

        if (nums.length ==0) return 0;

        int leftPointer = 0;

        for (int rightPointer = 1; rightPointer < nums.length; rightPointer++) {
            if (nums[leftPointer] != nums[rightPointer]) {
                leftPointer++;
                nums[leftPointer] = nums[rightPointer];
            }
        }
        return leftPointer + 1;
    }


    // Test Case

    public static void main(String[] args) {
        // Test case
        removeDuplicatesfromSortedArray testCase = new removeDuplicatesfromSortedArray();
        int[] nums1 = {1, 1, 2};
        int[] nums2 = {1, 2, 3, 3, 4, 5};

        int result1 = testCase.removeDuplicates(nums1);
        int result2 = testCase.removeDuplicates(nums2);

        System.out.println("Result 1: " + result1); // Expected output: 2
        System.out.println("Result 2: " + result2); // Expected output: 5

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
    }

}

// nums = [1, 1, 2] Remove all the duplicates from this array
// nums = [1, 2, 3, 3, 4, 5] Remove all the duplicates from this array