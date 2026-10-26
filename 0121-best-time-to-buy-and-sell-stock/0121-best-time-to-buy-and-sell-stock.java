class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int maxprofit=0;
        int minprice=prices[0];
        for(int i=0;i<n;i++)
        {
            int currentprofit=prices[i]-minprice;
            maxprofit=Math.max(currentprofit, maxprofit);
            minprice=Math.min(minprice,prices[i]);
        }
        return maxprofit;
    }
}