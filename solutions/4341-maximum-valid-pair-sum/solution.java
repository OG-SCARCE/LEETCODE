class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int ml = Integer.MIN_VALUE;
        int ms = Integer.MIN_VALUE;

        for (int j = k; j < nums.length; j++){
            ml = Math.max(ml, nums[j - k]);
            ms = Math.max(ms, ml+nums[j]);
        }
        return ms;
    }
}
