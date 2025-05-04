
import java.util.Arrays;


class longestCommonPrefix {
    public String longestCommonPrefixBruteFoceApproach(String[] strs) {
        if (strs == null || strs.length == 0) return ""; // handle edge case

        Arrays.sort(strs); // sort the array

        String base = strs[0];
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < base.length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                if (base.charAt(i) != strs[j].charAt(i)) {
                    return result.toString();
                }
            }
            result.append(base.charAt(i));
        }
        return result.toString();
    }

    public String longestCommonPrefixEfficientApproach(String[] strs) {
        // Edge case: if the array is null or empty, return an empty string
        if (strs == null || strs.length == 0) return "";

        StringBuilder solution = new StringBuilder();
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];

        // [Club, Clue, Clumsy, Cluster, Clutch]
        // Club
        // Clutch

        for (int charIndex = 0; charIndex < first.length(); charIndex++) {
            if (first.charAt(charIndex) == last.charAt(charIndex)) {
                solution.append(first.charAt(charIndex));
            } else {
                break;
            }
        }

        return solution.toString();
    }


    public static void main(String[] args) {
        longestCommonPrefix testCase = new longestCommonPrefix();
        String[] strs1 = {"flower", "flow", "flight"};
        String[] strs2 = {"dog", "racecar", "car"};
        String[] strs3 = {"a"};
        String[] strs4 = {"ab", "a"};

        String result1 = testCase.longestCommonPrefixBruteFoceApproach(strs1);
        String result2 = testCase.longestCommonPrefixBruteFoceApproach(strs2);
        String result3 = testCase.longestCommonPrefixBruteFoceApproach(strs3);
        String result4 = testCase.longestCommonPrefixBruteFoceApproach(strs4);

        // Testing the efficient approach
        String result5 = testCase.longestCommonPrefixEfficientApproach(strs1);
        String result6 = testCase.longestCommonPrefixEfficientApproach(strs2);
        String result7 = testCase.longestCommonPrefixEfficientApproach(strs3);
        String result8 = testCase.longestCommonPrefixEfficientApproach(strs4);


        // Print results
        System.out.println("Brute Force Approach:");
        System.out.println("Result 1: " + result1); // Output: "fl"
        System.out.println("Result 2: " + result2); // Output: ""
        System.out.println("Result 3: " + result3); // Output: "a"
        System.out.println("Result 4: " + result4); // Output: "a"

        System.out.println("Efficient Approach:");
        System.out.println("Result 5: " + result5); // Output: "fl"
        System.out.println("Result 6: " + result6); // Output: ""
        System.out.println("Result 7: " + result7); // Output: "a"
        System.out.println("Result 8: " + result8); // Output: "a"
    }

}
