class Solution {
    public long maximizeSum(int[] nums, int k) {
        long sum = 0;
        int n = nums.length;
        long[] gain = new long[n];

        for(int i = 0; i < n; i++){
            int num = nums[i];
            sum += num;

            char[] digits = String.valueOf(num).toCharArray();
            Arrays.sort(digits);

            long maxNum = 0;
            for(int j = digits.length - 1; j >= 0; j--){
                maxNum = maxNum * 10 + (digits[j] - '0');
            }

            gain[i] = maxNum - num;
        }
        Arrays.sort(gain);

        for(int i = n - 1; i >= 0 && k > 0; i--, k--){
            sum += gain[i];
            
        }
        return sum;
    }
}
