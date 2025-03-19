import java.util.Arrays;
import java.util.Scanner;

public  class  Number_with_Even_Digits{
    public static int findNumbers(int[] nums){
        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            if ((nums[i] > 9 && nums[i] < 100) || (nums[i] > 999 && nums[i] < 10000) || nums[i] == 100000) {
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");

        int n = sc.nextInt();
        System.out.println("Enter " + n + " Elements: ");
        int [] nums = new int [n];
        for(int i=0; i<n; i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Number of Even Digits :"+ (findNumbers(nums)));
    }
}
