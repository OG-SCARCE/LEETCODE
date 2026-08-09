import java.util.*;
class Solution {
    public long weightedSum(int[] parent, int[] nums) {
        int n = parent.length;
        List<List<Integer>> tree = new ArrayList<>();

        for (int i = 0; i < n; i++){
            tree.add(new ArrayList<>());
        }
        for (int i = 1; i < n; i++){
            tree.get(parent[i]).add(i);
        }
        int[] depth = new int [n];
        depth[0] = 1;
        Queue<Integer> q = new LinkedList<>();
        q.offer(0);

        int height = 1;

        while (!q.isEmpty()) {
            int node = q.poll();

            for (int child : tree.get(node)) {
                depth[child] = depth[node] + 1;
                height = Math.max(height, depth[child]);
                q.offer(child);
            }
        }

        long ans = 0;

        for (int i = 0; i < n; i++){
            ans += (long) nums[i] * (height - depth[i]  + 1);
        }
        return ans;
    }   
}
