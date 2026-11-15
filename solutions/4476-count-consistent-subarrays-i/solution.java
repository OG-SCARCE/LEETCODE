class Solution {
    public int countConsistent(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            int min = nums[i];
            int and = nums[i];

            for(int j = i; j < nums.length; j++){
                min = Math.min(min, nums[j]);
                and = and & nums[j];
                if (and == min){
                    count++;
                }            
            }
        }

        return count;
    }
}
