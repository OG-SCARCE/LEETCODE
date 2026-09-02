class Solution {
    int[] dp =  new int[102];
    private int function(int i, int[] nums){
        if(i >= nums.length){
            return 0;
        }
        if(dp[i]!= -1) return dp[i];
        int c1 = nums[i] + function(i + 2, nums);
        int c2 = function(i + 1, nums);
        int ans =  Math.max(c1, c2);
        dp[i] = ans;
        return ans;
    }
    public int rob(int[] nums) {
        for(int i = 0 ; i < dp.length; i++){
            dp[i] = -1;
        }
        return function(0, nums);
    }
}

