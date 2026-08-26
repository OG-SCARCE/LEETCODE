import java.util.HashMap;
import java.util.Map;

class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int n = s.length();
        String result = "";
        int minLength = Integer.MAX_VALUE;
        
        int left = 0;
        int countOnes = 0;
        
        for (int right = 0; right < n; right++) {
            if (s.charAt(right) == '1') {
                countOnes++;
            }
            
            while (countOnes == k) {
                int currentLength = right - left + 1;
                String currentStr = s.substring(left, right + 1);
                
                if (currentLength < minLength) {
                    minLength = currentLength;
                    result = currentStr;
                } else if (currentLength == minLength) {
                    if (currentStr.compareTo(result) < 0) {
                        result = currentStr;
                    }
                }
                
                if (s.charAt(left) == '1') {
                    countOnes--;
                }
                left++;
            }
        }
        
        return result;
    }
}

