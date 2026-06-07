class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;

        if (n == 1) return 0;

        int l = 0;
        int r = n - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            
            boolean leftOk = (mid == 0) || (nums[mid] > nums[mid - 1]);
            boolean rightOk = (mid == n - 1) || (nums[mid] > nums[mid + 1]);

            if (leftOk && rightOk) {
                return mid;
            }

            
            if (mid < n - 1 && nums[mid] < nums[mid + 1]) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return -1;
    }
}
