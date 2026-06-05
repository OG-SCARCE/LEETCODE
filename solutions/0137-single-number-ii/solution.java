class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for(int i = 0; i < 32; i++){
            int count = 0;
            for(int j = 0; j < n; j++){
                if((nums[j] & (1 << i)) != 0){
                    count++;
                }
            }
             if(count % 3 == 1){
                    ans = ans | (1 << i);
                }
        }
        return ans;
    }
}
