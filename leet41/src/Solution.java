class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;

        int i = 0;
        int j = 1;

        while(i < j && j < prices.length){
            if(prices[j] < prices[i]){
                i = j;
            }


            if(prices[j] - prices[i] > maxProfit){
                maxProfit = prices[j] - prices[i];
            }

            j++;
        }

        return maxProfit;
    }
}