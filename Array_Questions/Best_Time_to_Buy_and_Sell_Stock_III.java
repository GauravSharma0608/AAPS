public class Best_Time_to_Buy_and_Sell_Stock_III {

        public int maxProfit(int[] prices) {
            int buy1 = Integer.MIN_VALUE, sell1 = 0;
            int buy2 = Integer.MIN_VALUE, sell2 = 0;

            for (int price : prices) {
                // Track the lowest cost to buy first stock
                buy1 = Math.max(buy1, -price);

                // Track max profit after first sell
                sell1 = Math.max(sell1, buy1 + price);

                // Track max profit after second buy using profit from first sell
                buy2 = Math.max(buy2, sell1 - price);

                // Track final max profit after second sell
                sell2 = Math.max(sell2, buy2 + price);
            }

            return sell2;
        }

        // Test the solution
        public static void main(String[] args) {
            Best_Time_to_Buy_and_Sell_Stock_III sol = new Best_Time_to_Buy_and_Sell_Stock_III();

            int[] prices1 = {3, 3, 5, 0, 0, 3, 1, 4};
            int[] prices2 = {1, 2, 3, 4, 5};
            int[] prices3 = {7, 6, 4, 3, 1};
            int[] prices4 = {2, 1, 2, 0, 1};

            System.out.println("Max Profit 1: " + sol.maxProfit(prices1)); // Output: 6
            System.out.println("Max Profit 2: " + sol.maxProfit(prices2)); // Output: 4
            System.out.println("Max Profit 3: " + sol.maxProfit(prices3)); // Output: 0
            System.out.println("Max Profit 4: " + sol.maxProfit(prices4)); // Output: 2
        }
    }


