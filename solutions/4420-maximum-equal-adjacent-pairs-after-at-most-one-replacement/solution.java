class Solution {
    public int maxEqualAdjacentPairs(int[] nums) {
        int ans = 0;

        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 1; i < nums.length;i++){
            int a = nums[i - 1];
            int b = nums[i];

            if(a == b) {
                ans ++;
                continue;
            }

            int x = Math.min(a, b);
            int y = Math.max(a, b);

            String key = x + "#" + y;

            int freq = map.getOrDefault(key, 0) + 1;
            map.put(key, freq);
        }

        int maxgain = 0;

        for(int freq : map.values()) {
            maxgain = Math.max(maxgain, freq);
        }

        return ans + maxgain;
        
    }
}
