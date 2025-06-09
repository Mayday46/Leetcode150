public class jumpGameII {
    public int jump(int[] nums) {
        int totalJumps = 0;
        int destination = nums.length - 1;
        int coverage = 0, currentRangeEnd = 0;

        if (nums == null || nums.length == 1) return 0;

        for (int i = 0; i< nums.length - 1; i++) {
            coverage = Math.max(coverage, i + nums[i]); // The longest distance we can reach from the current index.

            if (i == currentRangeEnd) {
                currentRangeEnd = coverage; // Update the last jump index to the furthest we can reach.
                totalJumps++; // Increment the jump count.

                if (coverage >= destination) {
                    return totalJumps; // If we can reach or exceed the destination, return the jump count.
                }
            }

        }



        return totalJumps;
    }


    // test case
    public static void main(String[] args) {
        jumpGameII jg = new jumpGameII();
        int[] nums = {2, 3, 1, 1, 4};
        System.out.println(jg.jump(nums)); // Output: 2
    }
}
