class Solution {
    public int trailingZeroes(int n) {
        int ans = 0;
        if (n < 5) return 0; // no multiples of 5 → no trailing zeros

        while (n > 0) {
            n = n / 5;  // count multiples of 5, 25, 125...
            ans += n;
        }

        return ans;
    }
}
