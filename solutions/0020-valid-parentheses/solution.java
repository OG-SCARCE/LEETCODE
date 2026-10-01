import java.util.*;

class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        // Use standard ArrayList as a list-backed stack
        List<Character> list = new ArrayList<>(); 

        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');

        int counter = 0;
        while(counter != s.length()){
            if(list.isEmpty()){
                list.add(s.charAt(counter));
                counter++;
            } 
            else if(map.get(list.get(list.size() - 1)) != null && 
                    map.get(list.get(list.size() - 1)) == s.charAt(counter)){
                list.remove(list.size() - 1);
                counter++;
            } else {
                list.add(s.charAt(counter));
                counter++;
            }
        }

        return list.isEmpty();
    }
}

