class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        Integer[][] dp = new Integer[n][n];

        int ans = Integer.MAX_VALUE;

        for (int j = 0; j < n; j++) {
            ans = Math.min(ans, function(0, j, matrix, dp, n));
        }

        return ans;
    }

    int function(int i, int j, int[][] mat, Integer[][] dp, int n) {
        if (j < 0 || j >= n) {
            return Integer.MAX_VALUE / 2;
        }

        if (i == n - 1) {
            return mat[i][j];
        }

        if (dp[i][j] != null) {
            return dp[i][j];
        }

        int down = function(i + 1, j, mat, dp, n);
        int left = function(i + 1, j - 1, mat, dp, n);
        int right = function(i + 1, j + 1, mat, dp, n);

        dp[i][j] = mat[i][j] + Math.min(down, Math.min(left, right));

        return dp[i][j];
    }
}
