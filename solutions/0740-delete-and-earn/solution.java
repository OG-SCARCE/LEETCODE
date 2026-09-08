import java.util.*;

class Solution {

    int[] dp = new int[20005];

    int fun(int i, int[] nums, Map<Integer, Integer> m1) {

        if (i == nums.length - 1) {
            return nums[i] * m1.get(nums[i]);
        }

        if (i >= nums.length) {
            return 0;
        }

        if (dp[i] != -1) {
            return dp[i];
        }

        int m = 0;

        if (i + 1 < nums.length && nums[i + 1] == nums[i] + 1) {
            int a = (nums[i] * m1.get(nums[i]))
                    + fun(i + 2, nums, m1);

            m = Math.max(m, a);
        }

        if (i + 1 < nums.length && nums[i + 1] != nums[i] + 1) {
            int a = (nums[i] * m1.get(nums[i]))
                    + fun(i + 1, nums, m1);

            m = Math.max(m, a);
        }

        int a = fun(i + 1, nums, m1);
        m = Math.max(m, a);

        return dp[i] = m;
    }

    public int deleteAndEarn(int[] nums) {

        Map<Integer, Integer> m1 = new HashMap<>();

        for (int a : nums) {
            m1.put(a, m1.getOrDefault(a, 0) + 1);
        }

        int[] v1 = new int[m1.size()];
        int index = 0;

        for (int a : m1.keySet()) {
            v1[index++] = a;
        }

        Arrays.sort(v1);

        Arrays.fill(dp, -1);

        return fun(0, v1, m1);
    }
}
