import java.util.Arrays;

class Solution {
    int[][] dp = new int[102][2]; 

    private int function(int i, int[] nums, int flag){
        if (i == nums.length - 1) {
            if (flag == 1) return 0; 
            return nums[i];          
        }
        
        if(i >= nums.length){
            return 0;
        }
        
        if(dp[i][flag] != -1) return dp[i][flag];
        
        int curr = (i == 0 || flag == 1) ? 1 : 0;
        int c1 = nums[i] + function(i + 2, nums, curr);
        int c2 = function(i + 1, nums, flag);
        
        int ans = Math.max(c1, c2);
        dp[i][flag] = ans;
        return ans;
    }

    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        
        for(int i = 0 ; i < dp.length; i++){
            Arrays.fill(dp[i], -1);
        }
        
        return function(0, nums, 0);
    }
}
