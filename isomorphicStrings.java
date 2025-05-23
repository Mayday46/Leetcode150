
import java.util.HashMap;

public class isomorphicStrings {
    
    public boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length()) return false;
        HashMap<Character, Character> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if (!map.containsKey(sChar) && !map.containsValue(tChar)) {
                map.put(sChar, tChar);
            } else if (map.containsKey(sChar) && map.get(sChar) != tChar) {
                return false;
            } else if (!map.containsKey(sChar) && map.containsValue(tChar)) {
                return false;
            }
        }
        return true;
    }


}
