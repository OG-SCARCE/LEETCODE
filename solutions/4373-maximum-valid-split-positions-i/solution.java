class Solution {
    int gcd (int a, int b){
        return b == 0 ? a : gcd(b, a % b);
    }
    public int maxValidSplits(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for(int rem = -1; rem < n; rem++){
            int m = n - (rem == -1 ? 0 : 1);
            int[] a = new int[m];

            for(int i = 0, j = 0; i < n; i++)
                if(i != rem) a[j++] = nums[i];

            int[] pre = new int[m];
            int[] suf = new int[m];

            pre[0] = a[0];
            for(int i = 1; i < m; i++)
                pre[i] = gcd(pre[i - 1], a[i]);

            suf[m - 1] = a[m - 1];
            for(int i = m - 2; i >= 0; i--)
                suf[i] = gcd(a[i], suf[i + 1]);

            int score = 0;
            for(int i = 0; i < m - 1; i++)
                if(pre[i] == suf[i + 1]) score++;

            ans = Math.max(ans,score);
        }
        return ans;
    }
}
