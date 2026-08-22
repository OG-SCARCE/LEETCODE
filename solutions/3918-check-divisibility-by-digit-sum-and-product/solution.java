class Solution {
    public boolean checkDivisibility(int n) {
        if (n == 0){
            return false;
        }
        int sum = 0;
        int product = 1;
        int rem = 0;
        int num = n;
        while (num != 0){
            rem = num % 10;
            sum += rem;
            product *= rem;
            num = num /10;
        }
        double add = sum + product;
        double ans = (double) n / add;
        System.out.print(ans);

        return ans % 1 == 0;
    }
}
