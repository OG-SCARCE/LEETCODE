class Solution {
    public boolean check(String prev, String curr) {

        if (curr.length() != prev.length() + 1) {
            return false;
        }

        int i = 0;
        int j = 0;

        while (i < prev.length() && j < curr.length()) {

            if (prev.charAt(i) == curr.charAt(j)) {
                i++;
            }

            j++;
        }

        return i == prev.length();
    }

    public int solve(int i, String[] words, int[] dp) {

        if (dp[i] != -1) {
            return dp[i];
        }

        int ans = 1;

        for (int j = i + 1; j < words.length; j++) {

            if (check(words[i], words[j])) {

                ans = Math.max(ans,1 + solve(j, words, dp));
            }
        }

        return dp[i] = ans;
    }

    public int longestStrChain(String[] words) {

        Arrays.sort(words, (a, b) -> a.length() - b.length());

        int n = words.length;

        int[] dp = new int[n];
        Arrays.fill(dp, -1);

        int ans = 1;

        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, solve(i, words, dp));
        }

        return ans;
    }
}
