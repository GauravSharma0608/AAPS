import java.util.HashMap;
import java.util.Map;

public class Maximum_length {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        map.put(0, -1);
        int maxLength = 0;

        for (int i = 0; i < nums.length; i++) {
            count += (nums[i] == 1) ? 1 : -1;
            if (map.containsKey(count)) {
                maxLength = Math.max(maxLength, i - map.get(count));
            } else {
                map.put(count, i);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        Maximum_length solution = new Maximum_length();
        int[] nums = {0, 1, 0, 1, 1, 0, 0};
        System.out.println("Maximum length of a contiguous subarray with equal number of 0s and 1s: " + solution.findMaxLength(nums));
    }
}
