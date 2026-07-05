class Solution {
    public int maxDigitRange(int[] nums) {
        int maxRange = -1;
        int sum = 0;

        for (int num : nums) {
            int range  = getDigitRange(num);
            if (range > maxRange) {
                maxRange = range;
                sum = num;
            } else if (range == maxRange){
                sum += num;
            }
            
        }
        return sum;
    }
    private int getDigitRange(int num){
        int maxDigit = 0;
        int minDigit = 9;

        if (num == 0) return 0;

        int temp = Math.abs(num);

        while (temp > 0) {
            int digit = temp % 10;
            if (digit > maxDigit) maxDigit = digit;
            if (digit < minDigit) minDigit = digit;
            temp /= 10;
        }
        return maxDigit - minDigit;
    }
}
