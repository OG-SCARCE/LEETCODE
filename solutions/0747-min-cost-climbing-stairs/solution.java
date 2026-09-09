class Solution {
    private int function(int[] cost, int idx, int[] dp) {
        if (idx >= cost.length) {
            return 0;
        }
        if(dp[idx] != -1){  
            return dp[idx];
        }

        int c1 = cost[idx] + function(cost, idx + 1, dp);
        int c2 = cost[idx] + function(cost, idx + 2, dp);

        return dp[idx]=Math.min(c1, c2);
    }

    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        Arrays.fill(dp, -1);
        return Math.min(function(cost, 0, dp), function(cost, 1, dp));

    }
}
