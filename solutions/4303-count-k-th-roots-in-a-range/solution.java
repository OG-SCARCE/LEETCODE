class Solution{
    public int countKthRoots(int l, int r, int k) {
        if(k == 1) return r - l + 1; 
        int count = 0;
        for(int i = 0;;i++){
            long val = pow(i,k);
            if(val >= l && val<=r) count++;
            else if(val>r) break;
            
        }
        return count;
    }
    public long pow(long base, int exp){
        long res = 1;
        for(int i = 0; i < exp;i++){
            res*=base;
            if(res>(long)2e18) return Long.MAX_VALUE;
            
        }
        return res;
    }
}
// class Solution {
//     public int countKthRoots(long l, long r, int k) {
//         return (int)(kthRoot(r, k) - kthRoot(l - 1, k));
//     }
//     public long kthRoot(long n, int k){
//         if (n < 0) return 0;
//         long low = 0;
//         long high = (long)1e9;
//         long ans = 0;

//         while (low <= high){
//             long mid = low + (high - low)/ 2;
//             if (isPossible(mid, k, n)){
//                 ans = mid;
//                 low = mid + 1;
//             } else {
//                 high = mid - 1;
//             }
            
//         }
//         return ans;
//     }
//     private boolean isPossible (long base, int exp, long limit){
//         if (base == 0){
//             return true;
//         }
        
//         long res = 1;

//         for (int i = 0; i < exp; i++){
//             if (base != 0 && res > limit / base){
//                 return false;
//             }    
//             res *= base;
//         }
//         return res <= limit;
//     }
// }
