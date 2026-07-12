class Solution {
    public int[] arrayRankTransform(int[] arr) {
        if (arr.length == 0) return arr;
        int[][] pq = new int[arr.length][2];
        for (int i = 0; i < arr.length; i++) {
            pq[i][0] = arr[i];
            pq[i][1] = i;
        }
        java.util.Arrays.sort(pq, (a, b) -> Integer.compare(a[0], b[0]));
        int rank = 1;
        int prevValue = pq[0][0];
        arr[pq[0][1]] = rank;
        for (int i = 1; i < pq.length; i++) {
            if (pq[i][0] == prevValue) {
                arr[pq[i][1]] = rank;
            } else {
                rank++;
                prevValue = pq[i][0];
                arr[pq[i][1]] = rank;
            }
        }
        return arr;
    }
}
