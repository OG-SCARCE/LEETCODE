class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int mi = nums.length /2;
        int me = nums[mi];
        int c = 0;
        for (int num : nums) {
            if (num == me) {
                c++;
            }

            if (c > 1) {
                return false;
            }
        }

        return c == 1;
    }
}
