
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class finding3DigitEvenNumbers {

    private boolean isPossible(int num, Map<Integer, Integer> freq) {
        Map <Integer, Integer> tempFreq = new HashMap<>(freq);
        int[] digits = new int[3];
        digits[0] = num / 100; // Hundreds place
        digits[1] = (num / 10) % 10; // Tens place
        digits[2] = num % 10; // Digits place

        for (int each : digits) {
            int count = tempFreq.getOrDefault(each, 0);
            if (count == 0) {
                return false; // Digit not available
            } else {
                tempFreq.put(each, count - 1); // Decrease the frequency
            }
        }
        return true; // All digits are available
    }



    public int[] findEvenNumbersSolution(int[] digit) {

        Map<Integer, Integer> table = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (int number : digit) {
            // Update the frequency of each digit in the table
            table.put(number, table.getOrDefault(number, 0) + 1);
        }

        for (int candidate = 100; candidate <= 999; candidate += 2) {
            if (isPossible(candidate, table)) {
                result.add(candidate);
            }
        }

        int[] ans = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }
        
        return ans; // Convert List to int[]
        
    }
    
    public static void main(String[] args) {
        finding3DigitEvenNumbers obj = new finding3DigitEvenNumbers();
        int[] digit = {2, 1, 3, 0};
        int[] result = obj.findEvenNumbersSolution(digit);
        
        for (int num : result) {
            System.out.print(num + " ");
        }
        // Output: 102 104 106 108 120 124 126 128 ...
    }
}
