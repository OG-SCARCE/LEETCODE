class Solution {
    public long minimumMaxValue(int n, int index, int value) {
        if(value == 1) return -1;

        int p = smallestPrimeFactor(value);
        if(index > 0 && (long) value - p < 2L * index) {
            return -1;
        }
        long ans = value;
        int remaining = n - index - 1;
        if(remaining > 0){
            ans += p;
            ans += 2L * (remaining - 1);
        }

        return ans;
    }

    private int smallestPrimeFactor(int x){
        for(int i = 2; (long) i * i <= x; i++){
            if(x % i == 0) return i;
        }
        return x;
    }
}
