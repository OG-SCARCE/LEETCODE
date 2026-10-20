class Solution {
    public int longestPalindrome(String s) {
        int[] dict = new int[255];
        int oddLen = 0, evenLen = 0;
        boolean isOdd = false;

        for (int i = 0; i < s.length(); i++) {
            dict[(int) s.charAt(i)]++;
        }

        for (int i = 0; i < 255; i++) {
            if (dict[i] % 2 == 0) {
                evenLen += dict[i];
            } else {
                isOdd = true;
                oddLen += dict[i] - 1;
            }
        }

        if (!isOdd) return evenLen;

        return evenLen + oddLen + 1;
    }
}
