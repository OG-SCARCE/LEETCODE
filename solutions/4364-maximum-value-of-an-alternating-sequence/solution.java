class Solution {
    public long maximumValue(int n, int s, int m) {
        if (n == 1) return s;

        long peaks = n/2;
        return(long) s + peaks * (m - 1L) + 1;
    }
}
