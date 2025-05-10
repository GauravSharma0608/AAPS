import java.util.Scanner;

public class Missing_Number {
    public static int missing_number(int [] arr){
        int n = arr.length + 1;
        int actual_sum = 0;
        int expected_sum = n * (n + 1) / 2;

        for(int num : arr){
            actual_sum += num;
        }
        return expected_sum -actual_sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements (n - 1): ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter " + size + " numbers (from 1 to n with one missing):");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        int missing = missing_number(arr);
        System.out.println("The missing number is: " + missing);

        scanner.close();
    }
}
