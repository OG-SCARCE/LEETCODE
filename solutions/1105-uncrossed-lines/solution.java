class Solution {
    private int function(int i, int j, int[] s, int[] t, int[][] dp) {
        if (i >= s.length || j >= t.length) {
            return 0;
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        if (s[i] == t[j]) {
            dp[i][j] = 1 + function(i + 1, j + 1, s, t, dp);
        } else {
            int a = function(i, j + 1, s, t, dp);
            int b = function(i + 1, j, s, t, dp);

            dp[i][j] = Math.max(a, b);
        }

        return dp[i][j];
    }
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int[][] dp = new int[nums1.length][nums2.length];

        for (int i = 0; i < nums1.length; i++) {
            Arrays.fill(dp[i], -1);
        }

        return function(0, 0, nums1, nums2, dp);
    }
}

