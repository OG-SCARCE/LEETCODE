class Solution {
    private int gcd(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public int resilientSubarray(int[] nums, int k) {
        int n = nums.length;
        int ans = 0;
        int i = 0;

        while(i < n){
            int rem = ((nums[i] % k) + k) % k;
            int j = i;

            while(j < n && ((nums[j] % k) + k) % k == rem){
                j++;
            }

            int len = j - i;
            if(rem == 0){
                ans = Math.max(ans, len);
            } else {
                int g = gcd(rem, k);
                int period = k / g;

                int valid = 1 + ((len - 1)/ period) * period;
                ans = Math.max(ans, valid);
                
            }
            i = j;
        }
        return ans;
    }
}
