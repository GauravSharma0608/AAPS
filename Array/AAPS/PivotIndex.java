import java.util.Scanner;

public class PivotIndex {
    public int pivotIndex(int[] arr) {
        int[] pre = new int[arr.length];
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        pre[0] = 0;

        for (int i = 1; i < arr.length; i++) {
            pre[i] = pre[i - 1] + arr[i - 1];
        }

        for (int i = 0; i < arr.length; i++) {
            if (pre[i] == sum - arr[i] - pre[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        PivotIndex obj = new PivotIndex();
        int pivot = obj.pivotIndex(arr);

        System.out.println("Pivot Index: " + pivot);

        sc.close();
    }
}
