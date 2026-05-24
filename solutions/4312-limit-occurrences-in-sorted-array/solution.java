class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        int count = 0;
        int idx = 0;
        int prev = Integer.MIN_VALUE;
        int [] result = new int [nums.length];
        for (int num : nums){
            if (num != prev){
                prev = num;
                count = 1;
            } else {
                count++;
            }   
            if (count <= k){
                result[idx++] = num;
            }
        }
        return java.util.Arrays.copyOf(result, idx);
    }
}
