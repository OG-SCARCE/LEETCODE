class Solution {
    public boolean canMakeSubsequence(String s, String t) {
        int m = s.length();
        int n = t.length();

        if (m > n) return false;
        if (m == 1) return n >= 1;

        int[] leftMatch = new int[m];
        int tIndex = 0;
        for (int i = 0; i < m; i++){
            while (tIndex < n && t.charAt(tIndex) != s.charAt(i)){
                tIndex++;
            }
            leftMatch[i] = tIndex;
            if (tIndex < n) tIndex++;
        }
        if (leftMatch[m-1] < n) return true;

        int[] rightMatch = new int[m];
        tIndex = n - 1;
        for (int i = m - 1; i >= 0; i--){
            while (tIndex >= 0 && t.charAt(tIndex) != s.charAt(i)){
                tIndex--;
            }
            rightMatch[i] = tIndex;
            if (tIndex >= 0) tIndex--;
        }
        if (rightMatch[1] >= 1) return true;
        if (leftMatch[ m - 2 ] <= n - 2) return true;
        
        for (int i = 1; i < m - 1; i++){
            if (leftMatch[i-1] < n && rightMatch[i+1] >= 0) {
                if (rightMatch[i+1] - leftMatch[i - 1] >= 2) {
                    return true;
            
                } 
            }
        }
        return false;
    }
}
