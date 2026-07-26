class Solution {
    public List<List<Integer>> aggregateTimeSeries(int[][] series1, int[][] series2) {
        List<List<Integer>> ans = new ArrayList<>();
        int i = 0, j = 0, n = series1.length, m = series2.length;

        while (i < n || j < m) {
            int t;
            if (j == m || (i < n && series1[i][0] < series2[j][0]))
                t = series1[i][0];
            else 
                t = series2[j][0];
            while (i < n && series1[i][0] < t) i++;
            while (j < m && series2[j][0] < t) j++;

            int a = i < n ? series1[i][1] : 0;
            int b = j < m ? series2[j][1] : 0;

            ans.add(Arrays.asList(t, a + b));

            if (i < n && series1[i][0] == t) i++;
            if (j < m && series2[j][0] == t) j++;
            
        }

        return ans;
    }
}
