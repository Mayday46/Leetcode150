public class lengthofLastWord {
    public int lengthofLastWord(String s) {
        String[] words = s.trim().split("[\\s\\p{Punct}]+");
        // trim() removes the spaces from the beginning and end of the string.
        // split("[\\s\\p{Punct}]+") splits the string into words using spaces and punctuation as delimiters.
        // The regex \\s matches any whitespace character (spaces, tabs, newlines)
        // The regex \\p matches any punctuation character like .,;:!? etc.
        // The + means one or more occurrences of the previous regex restriction.
        // So, this regex will split the string into words by removing all spaces and punctuation.
        
        if (words.length == 0) {
            return 0;
        }
        return words[words.length - 1].length();
    }

    public static void main(String[] args) {
        // Test Case
        lengthofLastWord testCase = new lengthofLastWord();
        String s1 = "Hello World";
        String s2 = "   fly me   to   the moon  ";
        String s3 = "luffy is still joyboy";
        String s4 = "   ";
        String s5 = "a";

        int result1 = testCase.lengthofLastWord(s1);
        int result2 = testCase.lengthofLastWord(s2);
        int result3 = testCase.lengthofLastWord(s3);
        int result4 = testCase.lengthofLastWord(s4);
        int result5 = testCase.lengthofLastWord(s5);
        System.out.println("Result 1: " + result1); // Output: 5
        System.out.println("Result 2: " + result2); // Output: 4
        System.out.println("Result 3: " + result3); // Output: 6
        System.out.println("Result 4: " + result4); // Output: 0
        System.out.println("Result 5: " + result5); // Output: 1


    }
}
