class Solution {
    public int titleToNumber(String columnTitle) {
        long ans = 0;

        // Same idea as decimal parsing, but base is 26.
        for (int i = 0; i < columnTitle.length(); i++) {
            char ch = columnTitle.charAt(i);
            ans = ans * 26 + (ch - 'A' + 1);
        }

        return (int) ans;
    }
}
