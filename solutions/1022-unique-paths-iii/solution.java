class Solution {

    int fun(int i, int j, int[][] grid, int n, int m, int cnt) {

        if (i >= n || j >= m || i < 0 || j < 0 || grid[i][j] == -1) {
            return 0;
        }

        if (grid[i][j] == 2) {
            return cnt == -1 ? 1 : 0;
        }

        int tt = grid[i][j];
        grid[i][j] = -1;
        int a = fun(i + 1, j, grid, n, m, cnt - 1);
        grid[i][j] = tt;

        int t2 = grid[i][j];
        grid[i][j] = -1;
        int b = fun(i, j + 1, grid, n, m, cnt - 1);
        grid[i][j] = t2;

        int t3 = grid[i][j];
        grid[i][j] = -1;
        int c = fun(i - 1, j, grid, n, m, cnt - 1);
        grid[i][j] = t3;

        int t4 = grid[i][j];
        grid[i][j] = -1;
        int d = fun(i, j - 1, grid, n, m, cnt - 1);
        grid[i][j] = t4;

        return a + b + c + d;
    }

    public int uniquePathsIII(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        int ans = 0;
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 0) {
                    cnt++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    ans += fun(i, j, grid, n, m, cnt);
                }
            }
        }

        return ans;
    }
}
