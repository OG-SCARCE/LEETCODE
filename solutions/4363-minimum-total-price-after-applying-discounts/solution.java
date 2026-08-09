class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        double total = 0.0;
    
        int i = prices.length - 1;
        int j = discounts.length - 1;

        while (i >= 0 && j >= 0)
            {
                total += prices[i]*(100.0 - discounts[j]) / 100.0;
                i--;
                j--;
            }

        while (i >= 0 ) {
            total += prices[i];
            i--;
        }
        // for (int i = 0; i < n - m; i++){
        // total += prices[i];
        // }
        // for (int i = 0; i < n - m; i++){
        //     int price = prices[n - 1 - i];
        //     int discount = discounts[m - 1 -i];
        
        //     total += price * (100.0 - discount) / 100.0;
        // }
    return total;
    }
}
