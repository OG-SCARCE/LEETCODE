class Solution {
    public int countValidPrefixes(String s) {
        int z = 0, o = 0, ans = 0;
        for (char c : s.toCharArray()) {
            if(c == '0') z++;
            else o++;
            if (Math.abs(z - o) <=1) ans++;
        }
        return ans;
    }
}
