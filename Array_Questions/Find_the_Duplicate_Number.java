import java.util.Arrays;

public class Find_the_Duplicate_Number {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++)
            if(nums[i] == nums[i+1]) return nums[i];
        return -1;
    }
    public static void main(String[] args) {
        Find_the_Duplicate_Number obj = new Find_the_Duplicate_Number();
        int[] nums = {1, 3, 4, 2, 2};
        int duplicate = obj.findDuplicate(nums);
        System.out.println("Duplicate number: " + duplicate);
    }
}
