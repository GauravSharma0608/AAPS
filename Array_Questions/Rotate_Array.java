import java.util.Scanner;

public class Rotate_Array {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // In case k > n

        reverse(nums, 0, n - 1);       // Step 1: Reverse the whole array
        reverse(nums, 0, k - 1);       // Step 2: Reverse the first k elements
        reverse(nums, k, n - 1);       // Step 3: Reverse the remaining elements
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");

        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter  " + n + " Elements :");
        for(int i = 0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the value of K:");
        int k = sc.nextInt();
    }
}
