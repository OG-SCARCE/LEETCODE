class Solution {
    public int countGoodRotations(int[] nums) {
        int n = nums.length;
        int half = n/2;

        long t = 0;

        for(int x : nums){
            t += x;
        }
        long sum = 0;
        for(int i = 0; i < half; i++){
            sum += nums[i];
        }
        int ans = 0;
        for(int i = 0; i < n; i++){
            if (sum > (t - sum)){
                ans++;
            }
            sum -= nums[i];
            sum += nums[(i + half) % n];
        }
        return ans;
    }
}
