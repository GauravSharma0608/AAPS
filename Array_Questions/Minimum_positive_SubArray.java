import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Minimum_positive_SubArray {
    public static int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int len = nums.size();
        int min = Integer.MAX_VALUE;

        for(int j = l; j <= r; j++){
            int sum = 0;
            for(int i=0; i<j; i++)
                sum += nums.get(i);

            min = (sum > 0) ? Math.min(sum, min) : min;

            int temp = sum;
            for(int i=j; i<len; i++){
                temp += nums.get(i) - nums.get(i-j);
                min = (temp > 0) ? Math.min(temp, min) : min;
            }
        }
        return (min != Integer.MAX_VALUE) ? min : -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        List<Integer> nums = new ArrayList<>();

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            nums.add(sc.nextInt());
        }

        System.out.println("Enter the range l and r:");
        int l = sc.nextInt();
        int r = sc.nextInt();


        System.out.println("Minimum positive subarray sum in the given range: " +minimumSumSubarray(nums,l,r));
    }
}
