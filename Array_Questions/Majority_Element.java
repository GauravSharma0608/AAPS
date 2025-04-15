import java.util.Arrays;

public class Majority_Element {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n/2];
    }
    public static void main(String[] args) {
        Majority_Element obj = new Majority_Element();

        int[] nums = {2, 2, 1, 1, 1, 2, 2};  // Example input
        int result = obj.majorityElement(nums);

        System.out.println("Majority element is: " + result);
    
    }
}
