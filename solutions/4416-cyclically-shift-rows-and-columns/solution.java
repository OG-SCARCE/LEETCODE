class Solution {
    public int[][] cyclicShift(int n, int[][] grid, int[] rowShift, int[] colShift) {
        // int n = grid.length;
        int[][] temp = new int[n][n];
        int[][] ans = new int[n][n];

        for(int i = 0; i < n; i++){
            int shift = rowShift[i] % n;

            for(int j = 0; j < n; j++){
                int newCol = (j - shift + n) % n;
                temp[i][newCol] = grid[i][j];
            }
        }

        for(int j = 0; j < n; j++){
            int shift = colShift[j] % n;

            for(int i = 0; i < n; i++){
                int newRow = (i - shift + n) % n;
                ans[newRow][j] = temp[i][j];
            }
        }
        return ans;
    }
}
