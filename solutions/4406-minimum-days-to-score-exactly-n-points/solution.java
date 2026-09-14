class Solution {
    public int minDays(int n) {
        int[] dp = new int[n+1];

        Arrays.fill(dp, Integer.MAX_VALUE);

        dp[0] = -1;

        for (int i = 0; i <= n; i++){
            if(dp[i] == Integer.MAX_VALUE){
                continue;
            }

            int points = 0;

            for(int k = 1; ; k++){
                points += k;

                if(i + points > n){
                    break;
                }
                int j = i + points;

                int days = dp[i] + k + 1;

                dp[j] = Math.min(dp[j], days);
            }
        }
        return dp[n];
    }
}
// i      → Abhi kitne SCORE hain?
// k      → Kitne DAYS ka streak try kar raha?
// points → Us streak se kitne POINTS milenge?
// j      → Streak ke baad NEW SCORE kya hoga?
// days   → Wahan pahunchne mein TOTAL DAYS kitne lagenge?
