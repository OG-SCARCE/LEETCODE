class Solution {
    int dist(int a, int b){
        int d = Math.abs(a - b);
        return Math.min(d, 10 - d);
    }

    public int minRotations(int n, String s){
        int original = 0;

        original += dist(0, s.charAt(0) - '0');
        for(int i = 1; i < n; i++){
            int a  = s.charAt(i - 1) - '0';
            int b = s.charAt(i) - '0';

            original += dist(a, b);
        }

        int ans = original;
        int last = s.charAt(n - 1) - '0';
        for(int k = 0; k < n; k++){
            int cost;

            if(k == 0){
                int first = s.charAt(0) - '0';

                cost = original - dist(0, first) + dist(0, last);
            } else {
                int prev = s.charAt(k - 1) - '0';
                int curr = s.charAt(k) - '0';
    
                cost = original - dist(prev, curr) + dist(prev, last);
                
            }
            ans = Math.min(ans, cost);
        }
        return ans;
    }
}
