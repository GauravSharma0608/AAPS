import java.util.Arrays;
import java.util.Scanner;

public class Kth_Smallest_Largest {
    public static void Kth_smallest_largest(int[] arr, int k){
        int n = arr.length;
        Arrays.sort(arr);

       int Kth_Smallest = arr[k-1];
       int Kth_Largest = arr[n-k];

        System.out.println("Kth_Smallest :" +Kth_Smallest);
        System.out.println("Kth_Largest :" +Kth_Largest);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array :");

        int n =sc.nextInt();
        int[]arr = new int[n];
        System.out.println("Enter " + n + " Elements :");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
       Kth_smallest_largest(arr,3);

    }
}
