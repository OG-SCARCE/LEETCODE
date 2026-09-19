class Solution {
    private int function(int[] nums, int idx, int flag, int[][] dp) {
        int n = nums.length;

        if (idx >= n) {
            return 0;
        }

        if (dp[idx][flag + 1] != -1) {
            return dp[idx][flag + 1];
        }

        int c2 = function(nums, idx + 1, flag, dp);
        int c1 = 0;

        if (flag == -1 || nums[idx] > nums[flag]) {
            c1 = 1 + function(nums, idx + 1, idx, dp);
        }

        return dp[idx][flag + 1] = Math.max(c1, c2);
    }

    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n][n + 1];

        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }

        return function(nums, 0, -1, dp);
    }
}
