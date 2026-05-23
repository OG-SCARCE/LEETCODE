class Solution {
    public int minimumSwaps(int[] nums) {
        int n = nums.length;
        int z = 0;
        for(int num:nums ){
            if(num==0) z++;
        }
        int swap = 0;
        for (int i = n-z;i<n;i++){
            if(nums[i]!=0) swap++;
        }
        return swap;
    }
}
