class Solution {
    public int largestInteger(int n, int s) {
        if (s > 9 * n) return -1;
        StringBuilder ans = new StringBuilder();
        while (n-- > 0) {
            int d = Math.min(9,s);
            ans.append(d);
            s -= d;
        }
        return Integer.parseInt(ans.toString());
    }
}
