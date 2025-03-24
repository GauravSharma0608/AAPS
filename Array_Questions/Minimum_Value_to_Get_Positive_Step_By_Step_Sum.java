public class Minimum_Value_to_Get_Positive_Step_By_Step_Sum {
    public int minStartValue(int[] nums) {
        int minPrefixSum = 0; // Initialize to track the minimum prefix sum
        int sum = 0; // This variable will keep track of the cumulative sum

        // Iterate through the array to compute the cumulative sum
        // and keep track of the minimum value reached by this sum
        for (int num : nums) {
            sum += num;
            minPrefixSum = Math.min(minPrefixSum, sum);
        }

        // The minimum start value should ensure that the cumulative sum
        // never drops below 1. If minPrefixSum is negative or zero,
        // the start value must be 1 - minPrefixSum to offset this deficit.
        // Otherwise, if minPrefixSum is already positive, start with 1.
        return 1 - minPrefixSum;
    }
    public static void main(String[] args) {
        Minimum_Value_to_Get_Positive_Step_By_Step_Sum obj = new Minimum_Value_to_Get_Positive_Step_By_Step_Sum();

        // Test Cases
        int[][] testCases = {
                {-3, 2, -3, 4, 2},  // Expected output: 5
                {1, 2},             // Expected output: 1
                {1, -2, -3},        // Expected output: 5
                {3, -5, 2, -1},     // Expected output: 4
                {-1, -2, -3, -4}    // Expected output: 11
        };

        for (int i = 0; i < testCases.length; i++) {
            System.out.println("Test Case " + (i + 1) + ": " + obj.minStartValue(testCases[i]));
        }
    }
}
