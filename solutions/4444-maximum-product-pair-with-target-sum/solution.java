class Solution {
    public int[] maxProductPair(int[] nums, int target) {
        int max = Integer.MIN_VALUE;
        int[] result = {-1, -1};

        for(int i = 0; i<nums.length;i++){
            for(int j = 0; j < nums.length; j++){
                if(i != j && nums[i] + nums[j] == target && nums[i] > nums[j]) {
                    int prod = nums[i] * nums[j];

                    if(prod > max){
                        max = prod;
                        result = new int[]{i, j};
                    }
                }
            }
        }

        return result;
    }
}
