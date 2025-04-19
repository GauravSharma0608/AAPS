import java.util.Arrays;

public class Contains_Duplicate {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        Contains_Duplicate cd = new Contains_Duplicate();
        int[] testArray = {1, 2, 3, 4, 5, 1};

        boolean result = cd.containsDuplicate(testArray);
        System.out.println("Contains duplicate: " + result);
    }
}
