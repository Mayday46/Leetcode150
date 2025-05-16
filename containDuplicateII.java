import java.util.HashMap;

public class containDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> reference = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!reference.containsKey(nums[i])) {
                reference.put(nums[i], i);
            } else {
                // We have seen this number before
                int prevIndex = reference.get(nums[i]);
                if (Math.abs(prevIndex - i) <= k) {
                    return true;
                }
                // Update index to latest occurrence
                reference.put(nums[i], i);
            }
        }
        return false;
    }
    }
