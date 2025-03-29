import java.util.Arrays;
import java.util.Scanner;

public class Left_and_Right_Sum_Differences {
    public static int[] leftRightDifference(int[] nums) {
        int left[] = new int[nums.length];
        int leftsum = 0;
        for(int i=0; i<nums.length; i++){
            left[i] = leftsum;
            leftsum = leftsum + nums[i];
        }
        int right[] = new int[nums.length];
        int rightsum = 0;
        for(int i=nums.length - 1; i>= 0; i--){
            right[i] = rightsum;
            rightsum = rightsum + nums[i];
        }
        for (int i=0; i<nums.length; i++){
            left[i] = Math.abs(left[i] - right[i]);
        }
        return left;

    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");

        int n =sc.nextInt();
        int []nums = new int[n];
        System.out.println("Enter " +n+ " Elements");
        for(int i=0; i<n; i++){
            nums[i] =sc.nextInt();
        }
        System.out.println(Arrays.toString(leftRightDifference(nums)));
    }
}
