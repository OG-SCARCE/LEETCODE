import java.util.ArrayList;
import java.util.List;

class Solution { 
    public boolean rotateString(String s, String goal) { 
        if (s.length() != goal.length()) { 
            return false; 
        } 
        
        if (s.length() == 0) {
            return true;
        }

        List<Integer> list = new ArrayList<>(); 
        
        int idx = 0; 
        while (idx < s.length()) { 
            if (s.charAt(idx) == goal.charAt(0)) { 
                list.add(idx); 
            } 
            idx++;
        } 

        for (int i = 0; i < list.size(); i++) { 
            int j = list.get(i); 
            idx = 0; 
            int count = 0; 

            while (count < goal.length()) { 
                if (s.charAt(j) == goal.charAt(idx)) { 
                    idx++; 
                    count++; 
                    j++; 
                    
                    if (j == s.length()) { 
                        j = 0; 
                    } 
                } else { 
                    break; 
                } 
            } 

            if (count == goal.length()) {
                return true;
            }
        } 

        return false; 
    } 
}

