package ½£Ö¸OfferµÚ2°æ;

public class _63 {
    public int maxProfit(int[] prices) {
        int maxBenefit = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i; j < prices.length; j++) {
                if (prices[j]-prices[i]>maxBenefit){
                    maxBenefit = prices[j]-prices[i];
                }
            }
        }
        return maxBenefit;
    }
}
