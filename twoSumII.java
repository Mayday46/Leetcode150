public class twoSumII {
    // 167. Two Sum II - Input array is sorted

    public int[] twoSum(int[] numbers, int target) {
        // Two pointer approach with binary search
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                return new int[] {left + 1, right + 1}; // Return 1-based indices
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[] {-1, -1}; // Placeholder for the result
    }

    public static void main(String[] args) {
        twoSumII solution = new twoSumII();
        int[] numbers = {2, 3, 4};
        int target = 6;
        int[] result = solution.twoSum(numbers, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}
