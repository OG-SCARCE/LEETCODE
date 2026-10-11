class Solution {
    private boolean isPrime(int num){
        for(int i = 2; i*i <= num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return num > 1;
        
    }
    public List<Integer> maxPrimes(int n, int s) {
        List <Integer> ans = new ArrayList<>();
        int sum = 0;

        for(int i = 2; i <= n; i++){
            if(isPrime(i)){
                if(sum + i > s){
                    break;
                }
                sum += i;
                ans.add(i);
            }
        }
        return ans;
    }
}
