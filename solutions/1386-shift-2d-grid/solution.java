class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {

        int m = grid.length;
        int n = grid[0].length;

        int[][] changed = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                // Convert (row,col) -> 1D index
                int curr = i * n + j;

                // Shift the index
                int newEle = (curr + k) % (m * n);

                // Convert 1D index -> (row,col)
                int row = newEle / n;
                int col = newEle % n;

                // Place element at its new position
                changed[row][col] = grid[i][j];
            }
        }

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            List<Integer> temp = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                temp.add(changed[i][j]);
            }

            result.add(temp);
        }

        return result;
    }
}
