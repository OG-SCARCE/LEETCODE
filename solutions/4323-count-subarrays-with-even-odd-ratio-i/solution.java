class Solution {
    public int countRatioSubarrays(int[] nums, int a, int b) {
        int n = nums.length;
        int ans = 0;

        for (int i = 0; i < n; i++){
            int even = 0, odd = 0;

            for (int j = i; j < n; j++){
                if ((nums[j] & 1) == 0)
                    even++;
                else
                    odd++;
                if(odd > 0 && 1L * even *b <= 1L * odd * a)
                    ans++;
            }
        }

        return ans;
    }
}
