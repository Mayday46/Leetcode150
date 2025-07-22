public class deleteCharacterstoMakeFancyString {
    public String makeFancyString(String s) {
        StringBuilder solution = new StringBuilder();
        char[] chars = s.toCharArray();
        char prevChar = chars[0]; // Initialize with a character that won't match
        int count = 1; // Count of consecutive characters
        solution.append(prevChar); // Add the first character to the solution

        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == prevChar) {
                count++;
                if (count < 3) { // Only add if count is less than 3
                    solution.append(chars[i]);
                }
            } else {
                prevChar = chars[i]; // Update previous character
                count = 1; // Reset count for new character
                solution.append(chars[i]); // Add the new character to the solution
            }
        }

        return solution.toString();
    }
}
