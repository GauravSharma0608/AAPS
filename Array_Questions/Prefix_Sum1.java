import java.util.*;

public class Prefix_Sum1 {

    public static int[] prefix_SUM(int[] arr) {
        int n = arr.length;
        int[] prefix = new int[n];
        prefix[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        return prefix;
    }


    public static int query_sum(int[] prefix, int L, int R) {

        if (L > 0) {
            return prefix[R] - prefix[L - 1];
        } else {
            return prefix[R];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " Elements :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        int[] prefix = prefix_SUM(arr);

        System.out.println("The prefix sum is:");
        for (int i = 0; i < n; i++) {
            System.out.print(prefix[i] + " ");
        }
        System.out.println();

        System.out.println("Enter the number of queries:");
        int q = sc.nextInt();

        System.out.println("Enter the queries (L, R) pairs:");
        for (int i = 0; i < q; i++) {
            int L = sc.nextInt();
            int R = sc.nextInt();
            // Since the problem assumes 1-based index, we subtract 1 to convert to 0-based.
            System.out.println("Sum of elements from " + L + " to " + R + " is: " +
                    query_sum(prefix, L - 1, R - 1));
        }
    }
}
