import java.util.Arrays;

public class Move_Zero {
    public void moveZeroes(int[] nums) {
        int left = 0;
        int right = 0;

        while(right < nums.length){
            if(nums[right] != 0){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
            right++;
        }
    }

    public static void main(String[] args) {
        Move_Zero mz = new Move_Zero();
        int[] nums = {0, 1, 0, 3, 12};
        mz.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
