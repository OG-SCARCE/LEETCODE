class Solution {

    private int[][] dp;

    private int function(int[] arr, int k, int prev, int i, int max) {

        if (i >= arr.length) {
            return 0;
        }

        // Already calculated
        if (dp[prev][i] != -1) {
            return dp[prev][i];
        }

        max = Math.max(max, arr[i]);

        int len = i - prev + 1;
        int ans;

        if (len == k) {

            int part = (max * len)+ function(arr, k, i + 1, i + 1, 0);

            ans = part;

        } else {

            // Partition here
            int part = (max * len)+ function(arr, k, i + 1, i + 1, 0);

            // Don't partition
            int skip = function(arr, k, prev, i + 1, max);

            ans = Math.max(part, skip);
        }

        return dp[prev][i] = ans;
    }

    public int maxSumAfterPartitioning(int[] arr, int k) {

        int n = arr.length;

        dp = new int[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }

        return function(arr, k, 0, 0, 0);
    }
}
