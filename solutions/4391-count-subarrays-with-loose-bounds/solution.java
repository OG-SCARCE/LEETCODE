class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long c = 0;
        int I = -1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < minK || nums[i] > maxK){
                I = i;
            }
            else {
                c += i - I;
            }
        }
        return c;
    }
}
