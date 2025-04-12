
import java.util.HashMap;
import java.util.Map;

public class majorityElement {


    public int majorityElementSolution(int[] nums) {

        int maxValue = Integer.MIN_VALUE;
        Integer maxKey = null;

        Map <Integer, Integer> table = new HashMap<>();
        for (int digit : nums) {
            if (table.containsKey(digit)) {
                table.put(digit, table.get(digit + 1));
            }
            else {
                table.put(digit, 1);
            }
        }
        
        for (Map.Entry <Integer, Integer> entry : table.entrySet()) {
            if (entry.getValue() != null && entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }

        return maxKey;
    }
}
