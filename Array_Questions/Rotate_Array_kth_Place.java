import java.util.Arrays;
import java.util.Scanner;

public class Rotate_Array_kth_Place {
    public static int[] rotate_array_kth_place(int[]arr , int k){
        int n= arr.length;
        k = k % n;
        int [] rev = new int[n];
        int j=0;
        for(int i=n-k; i<n; i++){
            rev[j++] = arr[i];
        }
        for(int i= 0; i<n-k; i++){
            rev[j++] = arr[i];
        }

        return rev;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array:");
        int n= sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " +n+ " Elements :");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value of k: ");
        int k = sc.nextInt();



        System.out.println("Rotated Array: " + Arrays.toString(rotate_array_kth_place(arr,k)));
    }
}
