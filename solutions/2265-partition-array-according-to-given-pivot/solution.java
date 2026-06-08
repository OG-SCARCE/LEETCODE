class Solution {
    public int[] pivotArray(int[] nums, int pivot) {

        int n = nums.length;
        int[] ans = new int[n];

        int smallerCount = 0;
        int greaterCount = 0;

        for (int num : nums) {
            if (num < pivot)
                smallerCount++;

            if (num > pivot)
                greaterCount++;
        }

        // Fill with pivot
        java.util.Arrays.fill(ans, pivot);

        int sp = 0;
        int gp = n - greaterCount;

        for (int num : nums) {

            if (num < pivot) {
                ans[sp++] = num;
            }

            if (num > pivot) {
                ans[gp++] = num;
            }
        }

        return ans;
    }
}
