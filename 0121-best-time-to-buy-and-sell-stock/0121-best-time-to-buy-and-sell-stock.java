class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int MP=0;
        int bestbuy=prices[0];
        for(int i=0;i<n;i++){
            if(prices[i]>bestbuy){
                MP=Math.max(MP,prices[i]-bestbuy);
            }
            bestbuy=Math.min(prices[i],bestbuy);
        }
        return MP;
    }
}