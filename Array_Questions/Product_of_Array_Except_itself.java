import java.util.Arrays;
import java.util.Scanner;

public class Product_of_Array_Except_itself {
    public static int[] productExceptSelf(int[] nums) {

        int[] output = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            output[i] = 1;
        }

        int left = 1;
        for (int i = 0; i < nums.length; i++) {
            output[i] *= left;
            left *= nums[i];
        }

        int right = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            output[i] *= right;
            right *= nums[i];
        }

        return output;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Calling the function
        System.out.println("Array : " + Arrays.toString(productExceptSelf(nums)));
        }
    }


