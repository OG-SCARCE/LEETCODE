class Solution {
    public int minRotations(String s) {
        int curr = 0;
        int ans = 0;

        for(char ch : s.toCharArray()) {
            int next = ch - '0';

            int diff = Math.abs(curr - next);
            int rotations = Math.min(diff,  10 - diff);

            ans += rotations;
            curr = next;
        }

        return ans;
    }
}
