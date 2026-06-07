class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);

        int maximumGap = 0;
        int n = nums.length;

        if (n == 1) {
            return 0;
        }

        for (int i = 1; i < n; i++) {
            maximumGap = Math.max(
                maximumGap,
                nums[i] - nums[i - 1]
            );
        }

        return maximumGap;
    }
}
