class Solution {
    public int countSegments(String s) {
        if (s.isEmpty()) {
            return 0;
        }

        int cnt = 0;
        boolean m = false;

        for (char ch : s.toCharArray()) {
            if (ch != ' ') {
                m = true;
                continue;
            }

            if (ch == ' ' && m) {
                cnt++;
                m = false;
            }
        }

        if (m) {
            cnt++;
        }

        return cnt;
    }
}
