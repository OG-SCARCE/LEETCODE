class Solution {
    public long maxPairStrength(int[] nums) {
        long ans = 0;

        for (int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++) {
                long g = gcd(nums[i], nums[j]);
                long cur = (1L *nums[i] * nums[j]) / (g * g);
                ans = Math.max(ans, cur);
            }
        }
        return ans;
    }

    private long gcd(long a, long b){
        while (b != 0){
            long t =  a % b;
            a=b;
            b=t;
        }
        return a;
    }
}
