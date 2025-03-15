import java.util.Arrays;
import java.util.Scanner;

public class Shuffle_Array{
    public static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2 * n];
        for (int i = 0; i < n; i++) {
            ans[2 * i] = nums[i];
            ans[2 * i + 1] = nums[i + n];
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n (half the size of array): ");
        int n = sc.nextInt();  // Read `n`

        int size = 2 * n;  // Full array size = 2n
        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        System.out.println("Shuffled Array: " + Arrays.toString(shuffle(arr, n)));
    }
}
