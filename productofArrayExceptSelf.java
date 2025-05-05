public class productofArrayExceptSelf {

    public int[] productLeft (int[] nums) {
        int [] leftProduct = new int[nums.length];

        // calculate left products
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                leftProduct[i] = 1;
            } else {
                // nums = [1, 2, 3, 4]
                // leftProduct = [1, 1, 2, 6]
                leftProduct[i] = leftProduct[i - 1] * nums[i - 1];
            }
        }
        return leftProduct;
    }

    public int[] productRight (int[] nums) {
        int [] rightProduct = new int[nums.length];

        // calculate right products
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i == nums.length - 1) {
                rightProduct[i] = 1;
            } else {
                // nums = [1, 2, 3, 4]
                // rightProduct = [24, 12, 4, 1]
                rightProduct[i] = rightProduct[i + 1] * nums[i + 1];
            }
        }
        return rightProduct;
    }

    public int[] productExecptSelf(int[] nums) {
        // nums = [1, 2, 3, 4]
        // leftProduct = [1, 1, 2, 6]
        int[] leftProduct = productLeft(nums);
        // rightProduct = [24, 12, 4, 1]
        int[] rightProduct = productRight(nums);

        int[] result = new int[nums.length];

        for (int i = 0; i < result.length; i++) {
            result[i] = leftProduct[i] * rightProduct[i];
        }

        return result;
    }

    public static void main(String[] args) {

        // Test case
        productofArrayExceptSelf testCase = new productofArrayExceptSelf();
        int[] nums = {1, 2, 3, 4};
        int[] result = testCase.productExecptSelf(nums);
        // Expected output: [24, 12, 8, 6]
        System.out.print("Result: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }
}
