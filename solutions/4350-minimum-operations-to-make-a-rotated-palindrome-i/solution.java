class Solution {
    public int minOperations(String s) {
        int n = s.length();
        int ans = Integer.MAX_VALUE;

        for(int k = 0; k < n; k++) {
            int operations = k;

            for (int i = 0; i < n/2; i++){
                
                char a = s.charAt((i + k) % n);
                char b = s.charAt((n - i - 1 + k) % n);

                int diff1 = (b - a + 26 ) % 26;
                int diff2 = (a - b + 26 ) % 26;

                operations += Math.min(diff1, diff2);

            }
            ans = Math.min(ans, operations);
        }
        return ans;
    }
}
