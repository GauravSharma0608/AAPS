import java.util.HashMap;
import java.util.Map;

public class Continius_SubArray_Sum {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> remainderIndexMap = new HashMap<>();
        int sum = 0;
        remainderIndexMap.put(0, -1); // To handle cases where the subarray starts from index 0

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (k != 0) sum %= k;

            // Check if the remainder has been seen before
            if (remainderIndexMap.containsKey(sum)) {
                if (i - remainderIndexMap.get(sum) > 1) // If subarray length is greater than 1, return true
                    return true;
            } else { // Store the index of the first occurrence of the remainder
                remainderIndexMap.put(sum, i);
            }
        }
        return false; // No valid subarray found
    }

    public static void main(String[] args) {
        Continius_SubArray_Sum obj = new Continius_SubArray_Sum();

        // Test Cases
        int[][] testArrays = {
                {23, 2, 4, 6, 7},  // Expected: true (subarray [2,4] sum = 6, multiple of k=6)
                {23, 2, 6, 4, 7},  // Expected: true (subarray [2,6,4] sum = 12, multiple of k=6)
                {1, 2, 3},         // Expected: true (subarray [2,3] sum = 5, multiple of k=5)
                {1, 0},            // Expected: false (subarray lengths < 2)
                {0, 0},            // Expected: true (subarray [0,0] sum = 0, multiple of any k)
                {1, 2, 12},        // Expected: true (subarray [2,12] sum = 14, multiple of k=6)
                {1, 2, 3, 4, 5},   // Expected: false (no subarray with sum multiple of k=11)
        };
        int[] ks = {6, 6, 5, 2, 0, 6, 11};

        for (int i = 0; i < testArrays.length; i++) {
            System.out.println("Test Case " + (i + 1) + ": " + obj.checkSubarraySum(testArrays[i], ks[i]));
        }
    }
}
