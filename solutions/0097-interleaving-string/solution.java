class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        Boolean[][] dp = new Boolean[s1.length() + 1][s2.length() + 1];
        return fun(s1, s2, s3, 0, 0, dp);
    }

    boolean fun(String s1, String s2, String s3, int i, int j, Boolean[][] dp) {
        int k = i + j;
        if (s1.length() + s2.length() != s3.length()) return false;
        if (i == s1.length() && j == s2.length()) return true;
        if (dp[i][j] != null) return dp[i][j];

        boolean flag = false;
        if (i < s1.length() && s1.charAt(i) == s3.charAt(k))
            flag = fun(s1, s2, s3, i + 1, j, dp);
        if (!flag && j < s2.length() && s2.charAt(j) == s3.charAt(k))
            flag = fun(s1, s2, s3, i, j + 1, dp);

        dp[i][j] = flag;
        return flag;
    }
}
