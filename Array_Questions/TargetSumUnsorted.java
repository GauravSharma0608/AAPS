import java.util.*;

public class TargetSumUnsorted {

    // Method to find pairs with a target sum using HashSet
    static void findPairsWithSum(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();
        boolean found = false;

        for (int num : arr) {
            int complement = target - num;
            if (set.contains(complement)) {
                System.out.println("Pair found: (" + complement + ", " + num + ")");
                found = true;
            }
            set.add(num);
        }

        if (!found) {
            System.out.println("No pair found with sum " + target);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the target sum: ");
        int target = sc.nextInt();

        findPairsWithSum(arr, target);
        sc.close();
    }
}