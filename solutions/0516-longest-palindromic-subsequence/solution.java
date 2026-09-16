class Solution {
    private int function(int i, int j, String s, String t, int[][] dp) {
        if (i >= s.length() || j >= t.length()) {
            return 0;
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        if (s.charAt(i) == t.charAt(j)) {
            dp[i][j] = 1 + function(i + 1, j + 1, s, t, dp);
        } else {
            int a = function(i, j + 1, s, t, dp);
            int b = function(i + 1, j, s, t, dp);

            dp[i][j] = Math.max(a, b);
        }

        return dp[i][j];
    }

    public int longestPalindromeSubseq(String s) {
        String t = new StringBuilder(s).reverse().toString();
        int[][] dp = new int[s.length()][t.length()];

        for (int i = 0; i < s.length(); i++) {
            java.util.Arrays.fill(dp[i], -1);
        }

        return function(0, 0, s, t, dp);
    }
}

