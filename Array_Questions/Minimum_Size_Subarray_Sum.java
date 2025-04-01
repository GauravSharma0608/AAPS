import java.util.Scanner;

public class Minimum_Size_Subarray_Sum {
    public static int minSubArrayLen(int target, int[] nums) {
        int l = 0, s = 0, m = Integer.MAX_VALUE;
        for (int r = 0; r < nums.length; r++) {
            s += nums[r];
            while (s >= target) {
                m = Math.min(m, r - l + 1);
                s -= nums[l++];
            }
        }
        return (m == Integer.MAX_VALUE) ? 0 : m;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int n= sc.nextInt();

        System.out.println("Enter the target:");
        int target = sc.nextInt();
        int[] nums= new int[n];
        System.out.println("Enter " +n+ " Elements: ");
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(minSubArrayLen(target,nums));
    }
}
