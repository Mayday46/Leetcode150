public class reverseWordsinaString {
    public String reverseWords(String s) {
        String result = "";
        String[] words = s.trim().split("\\s+");
        for (int i = words.length - 1; i >= 0; i--) {
            result += words[i];
            if (i != 0) {
                result += " ";
            }
        }
        return result;
        
    }

    public static void main(String[] args) {
        reverseWordsinaString r = new reverseWordsinaString();
        String s = "  hello world!  ";
        System.out.println(r.reverseWords(s)); // Output: "world! hello"
    }
}
