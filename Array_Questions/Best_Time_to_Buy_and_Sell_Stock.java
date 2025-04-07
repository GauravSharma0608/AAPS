public class Best_Time_to_Buy_and_Sell_Stock {
    public int maxProfit(int[] prices) {
        // Initialize minPrice to a very large value and maxProfit to 0
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        // Traverse through the price array
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price; // Found a new minimum buying price
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice; // Found a better profit
            }
        }

        return maxProfit;
    }

    // You can use this main method to test the function
    public static void main(String[] args) {
        Best_Time_to_Buy_and_Sell_Stock sol = new Best_Time_to_Buy_and_Sell_Stock();

        // Example 1
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        System.out.println("Max Profit: " + sol.maxProfit(prices1)); // Output: 5

        // Example 2
        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.println("Max Profit: " + sol.maxProfit(prices2)); // Output: 0
    }
}
