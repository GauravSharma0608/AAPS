import java.util.*;

public class Two_Pointer_Approach {

    // Method to print the array
    static void print_Array(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); // Print on the same line with space
        }
        System.out.println(); // New line after printing the array
    }

    // Method to swap two elements in the array8
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

     //Method to sort an array with 0s and 1s using two-pointer approach
    static void sortZeroesAndOnes(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            if (arr[left] == 1 && arr[right] == 0) {
                swap(arr, left, right);
                left++;
                right--;
            }
            if (arr[left] == 0) {
                left++;
            }
            if (arr[right] == 1) {
                right--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid array size. Size must be positive.");
            sc.close();
            return;
        }

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array (only 0s and 1s):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original Array:");
        print_Array(arr);

        sortZeroesAndOnes(arr);

        System.out.println("Sorted Array:");
        print_Array(arr);

        sc.close();
    }
}