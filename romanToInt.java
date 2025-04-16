import java.util.HashMap;
import java.util.Map;

public class romanToInt {
    public int romanToIntSolution (String s) {
        int result = 0;
        Map <Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        // s = "MCMXCIV"
        for (int i = s.length() - 1; i >= 0; i--) { // We start from the end and work the way to the front.
            char currentChar = s.charAt(i); // Get the current character from the string.
            int currentValue = romanMap.get(currentChar); // Get the value of the current character from the map.

            // If the current value is less than the previous value, we subtract it from the result.
            // Otherwise, we add it to the result.
            if (i < s.length() - 1 && currentValue < romanMap.get(s.charAt(i + 1))) {
                // The purpose of adding the restriction of i < s.length() - 1 is to avoid the case where we are at the last character.
                // In this case, we don't have a next character to compare with.
                // If we are at the last character, we can just add it to the result.
                result -= currentValue;
            } else {
                result += currentValue;
            }
        }

        return result;
    }

    // Test the romanToIntSolution method
    public static void main(String[] args) {
        romanToInt testCase = new romanToInt();
        String s1 = "III";
        String s2 = "IV";
        String s3 = "IX";
        String s4 = "LVIII";
        String s5 = "MCMXCIV";

        int result1 = testCase.romanToIntSolution(s1);
        int result2 = testCase.romanToIntSolution(s2);
        int result3 = testCase.romanToIntSolution(s3);
        int result4 = testCase.romanToIntSolution(s4);
        int result5 = testCase.romanToIntSolution(s5);

        System.out.println("Result 1: " + result1); // Output: 3
        System.out.println("Result 2: " + result2); // Output: 4
        System.out.println("Result 3: " + result3); // Output: 9
        System.out.println("Result 4: " + result4); // Output: 58
        System.out.println("Result 5: " + result5); // Output: 1994
    }
}
