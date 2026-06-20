import java.util.*;

class Solution {
    public int maxBuilding(int n, int[][] r) {
        if (r.length == 0) return n - 1;

        Arrays.sort(r, (a, b) -> a[0] - b[0]);

        int id = 1, h = 0;

        for (int i = 0; i < r.length; i++) {
            r[i][1] = Math.min(r[i][1], r[i][0] - id + h);
            id = r[i][0];
            h = r[i][1];
        }

        for (int i = r.length - 2; i >= 0; i--) {
            r[i][1] = Math.min(r[i][1], r[i+1][1] + r[i+1][0] - r[i][0]);
        }

        int ans = n - r[r.length - 1][0] + r[r.length - 1][1];
        id = 1; h = 0;

        for (int i = 0; i < r.length; i++) {
            int x = r[i][0], y = r[i][1];
            int steps = x - id - Math.abs(y - h);
            int higher = Math.max(y, h);
            ans = Math.max(ans, higher + steps / 2);
            id = x;
            h = y;
        }

        return ans;
    }
}
