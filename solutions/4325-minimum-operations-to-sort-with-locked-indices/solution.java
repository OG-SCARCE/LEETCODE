class Solution {
    public int minOperations(int[] nums, int[] locked, int k) {
        int n = nums.length;
        boolean[] visited = new boolean[n];
        boolean[] needUnlock = new boolean[n];

        for(int i = 0; i < n;i++){
            if(visited[i]) continue;

            int cur = i;
            int min = n, max = -1, len = 0;

            while (!visited[cur]){
                visited[cur] = true;
                min = Math.min(min, cur);
                max = Math.max(max, cur);
                len++;

                cur = nums[cur] - 1;
            }

            if(len > 1){
                for(int j = min; j <= max; j++){
                    needUnlock[j] = true;
                }
            }
        }

        int unlock = 0;

        for(int i = 0; i < n; i++){
            if(needUnlock[i] && locked[i] == 1){
                unlock++;
            }
        }
        if(unlock > k) return -1;

        int swaps = 0;

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(nums[i] > nums[j]){
                    swaps++;
                }
            }
        }
        return swaps + unlock;
    }
}
