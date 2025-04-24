import java.util.Arrays;

public class First_Missing_Positive {
    public int firstMissingPositive(int[] nums) {
        int[] filteredNums = Arrays.stream(nums).filter(n -> n > 0).toArray();

        Arrays.sort(filteredNums);

        int target = 1;
        for (int n : filteredNums) {
            if (n == target) {
                target++;
            } else if (n > target) {
                return target;
            }
        }

        return target;
    }
    public static void main(String[] args) {
        First_Missing_Positive obj = new First_Missing_Positive();
        int[] nums = {3, 4, -1, 1};
        System.out.println("First Missing Positive: " + obj.firstMissingPositive(nums));
    }
}
