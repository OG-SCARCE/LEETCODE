class Solution {

    private Boolean[][][] dp;

    private boolean function(char[][] grid, int a, int b, int i, int j) {

        int n = grid.length;
        int m = grid[0].length;

        if (a >= n || b >= m) {
            return false;
        }

        if (grid[0][0] != '(') {
            return false;
        }

        if (i < j) {
            return false;
        }

        if (grid[a][b] == '(') {
            i++;
        } else {
            j++;
        }

        if (i < j) {
            return false;
        }

        if (dp[a][b][i] != null) {
            return dp[a][b][i];
        }

        if (a == n - 1 && b == m - 1) {
            return dp[a][b][i] = (i == j);
        }

        // Down
        boolean down = function(grid, a + 1, b, i, j);

        // Right
        boolean right = function(grid, a, b + 1, i, j);

        return dp[a][b][i] = down || right;
    }

    public boolean hasValidPath(char[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        dp = new Boolean[n][m][n + m + 1];

        return function(grid, 0, 0, 0, 0);
    }
}
