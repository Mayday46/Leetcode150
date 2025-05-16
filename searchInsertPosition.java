public class searchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {

            // int mid = left + (right - left) / 2; // This prevents overflow
            int mid = Math.floorDiv(left + right, 2); // Same as Python's // mid = (left + right) // 2

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        
        }
        return left; // If not found, return the position where it would be inserted
    }

    // Test the function
    public static void main(String[] args) {
        searchInsertPosition obj = new searchInsertPosition();
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        int result = obj.searchInsert(nums, target);
        System.out.println("The target " + target + " should be inserted at index: " + result); // Output: 2

        target = 2;
        result = obj.searchInsert(nums, target);
        System.out.println("The target " + target + " should be inserted at index: " + result); // Output: 1

        target = 7;
        result = obj.searchInsert(nums, target);
        System.out.println("The target " + target + " should be inserted at index: " + result); // Output: 4

        target = 0;
        result = obj.searchInsert(nums, target);
        System.out.println("The target " + target + " should be inserted at index: " + result); // Output: 0
    }
}
