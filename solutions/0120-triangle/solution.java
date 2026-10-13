class Solution {
    public int minimumTotal(List<List<Integer>> tri) {
        int n = tri.size();
        Integer[][] dp = new Integer[n][n];

        return solve(0, 0, tri, dp);
    }

    int solve(int i, int j, List<List<Integer>> tri,Integer[][] dp) {
        if (i == tri.size() - 1) {
            return tri.get(i).get(j);
        }

        if (dp[i][j] != null) {
            return dp[i][j];
        }

        int down = solve(i + 1, j, tri, dp);
        int diagonal = solve(i + 1, j + 1, tri, dp);

        dp[i][j] = tri.get(i).get(j)+ Math.min(down, diagonal);

        return dp[i][j];
    }
}
