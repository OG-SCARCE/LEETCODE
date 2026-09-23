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

        // System.out.println(dp[i][j]);
        return dp[i][j];
    }

    public int minDistance(String text1, String text2) {
        int[][] dp = new int[text1.length()][text2.length()];

        for (int i = 0; i < text1.length(); i++) {
            java.util.Arrays.fill(dp[i], -1);
        }

        return (text1.length() + text2.length()) - (2 *(function(0, 0, text1, text2, dp)));
    }
}
