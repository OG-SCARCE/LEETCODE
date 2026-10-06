import java.util.*;

class Solution {
    public char findTheDifference(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        
        for (char x : s.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        
        for (char x : t.toCharArray()) {

            if (!map.containsKey(x) || map.get(x) == 0) {
                return x;
            }
            map.put(x, map.get(x) - 1);
        }
        
        return ' ';
    }
}

