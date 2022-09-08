package leetcode.easy;

public class _121 {
    public int maxProfit(int prices[]) {
        /**
         * @Author yoto
         * @Description  对于每一天，做如下的判断。 今天的价格是否比之前的价格都低，如果都低，那我肯定不会卖出去，就只做记录，记录目前这个比以往都低的价格，
         * 今天的价格如果比之前的价格高，那么我可以考虑下是否卖出，计算一下到今天价格和前面最低价格的差值，得到今天最大利润。
         * 最后，判断一下，今天的这个最大利润，是否比之前的最大利润还大，若是，那么今天卖出就是最大利润了。
         * @Date 2022/8/29 16:29
        **/
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice) {
                minprice = prices[i];
            } else if (prices[i] - minprice > maxprofit) {
                //如果我是在历史最低点买进的，那么我今天卖出能赚多少钱？
                maxprofit = prices[i] - minprice;
            }
        }
        return maxprofit;
    }
}
