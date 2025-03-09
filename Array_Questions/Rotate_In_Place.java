import java.util.Arrays;
import java.util.Scanner;

public class Rotate_In_Place {
    public static void Print_Array(int []arr){
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }

    public static void Swap(int[]arr, int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void Reverse(int [] arr,int i ,int j){
        while(i<j) {
            Swap(arr, i, j);
            i++;
            j--;
        }
    }

    public static void rotate_in_place(int []arr ,int k){
        int n = arr.length;
        k=k%n;
        Reverse(arr ,0,n-k-1);
        Reverse(arr ,n-k,n-1);
        Reverse(arr ,0,n-1);

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
        System.out.println("Array before Rotation : ");
        Print_Array(arr);

        rotate_in_place(arr,k);
        System.out.println("Array After Rotation :");

        Print_Array(arr);

    }
}
