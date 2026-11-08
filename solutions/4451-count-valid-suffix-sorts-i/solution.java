class Solution {
    public int countSuffix(int[] nums, int[] target) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++){
            map.merge(nums[i], 1, Integer::sum);
            map.merge(target[i], -1, Integer::sum);
        }
        for(int v:map.values()){
            if(v != 0) return 0;
        }
        boolean[] sorted = new boolean[n];
        sorted[n - 1] = true;

        for(int i = n - 2; i>=0; i-- ){
            sorted[i] = target[i] >= target[i+1] && sorted[i + 1];
        }
        int ans = 0;
        boolean prefix = true;

        for(int i = 0;i < n; i++){
            if(prefix && sorted[i]) ans++;
            prefix &= nums[i]==target[i];
        }
        return ans;
    }
}
