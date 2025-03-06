import java.sql.SQLOutput; // Unnecessary import, but kept as per your request.
import java.util.Scanner;

public class Sort_Squares {

    static void print_array(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverse(int[] arr) {
        int i = 0, j = arr.length - 1;  // Corrected bounds
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    public static int[] sort_Squares(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        int k = n - 1;
        int[] ans = new int[n];
        while (left <= right) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                ans[k--] = nums[left] * nums[left];
                left++;
            } else {
                ans[k--] = nums[right] * nums[right];
                right--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Original Array:");
        print_array(arr);

        int[] sortedSquares = sort_Squares(arr); // Store result in a new array
        System.out.println("After Sort:");
        print_array(sortedSquares); // Print the sorted squares

//        System.out.println("Reversing Sorted Squares:");
//        reverse(sortedSquares); // Optional reverse to demonstrate the reverse function
//        print_array(sortedSquares);
    }
}
