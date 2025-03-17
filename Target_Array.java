import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Target_Array {
    public static int[] target_array(int[] nums, int[] index) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (index[i] > list.size()) {
                System.out.println("Error: Trying to insert at an index out of bounds.");
                return new int[]{}; // Return empty array in case of error
            }
            list.add(index[i], nums[i]); // Correct order: index first, element second
        }

        // Convert ArrayList to int[]
        int[] Target_array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            Target_array[i] = list.get(i);
        }

        return Target_array;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter " + n + " elements for nums array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] index = new int[n];
        System.out.println("Enter " + n + " elements for index array:");
        for (int i = 0; i < n; i++) {
            index[i] = sc.nextInt();
        }

//        int[] result = target_array(nums, index);
        System.out.println("Target Array: " + Arrays.toString(target_array(nums,index)));


    }
}
