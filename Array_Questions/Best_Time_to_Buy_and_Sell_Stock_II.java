public class Best_Time_to_Buy_and_Sell_Stock_II {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for(int i=1;i<prices.length;i++) {
            if(prices[i] > prices[i-1]) {
                profit += prices[i] - prices[i-1];
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        Best_Time_to_Buy_and_Sell_Stock_II obj = new Best_Time_to_Buy_and_Sell_Stock_II();
        int[] prices = {7,1,5,3,6,4};
        System.out.println(obj.maxProfit(prices));
    }
}
