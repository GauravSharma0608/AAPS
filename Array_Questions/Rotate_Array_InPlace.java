import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Rotate_Array_InPlace {
    static void print_Array(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); // Print on the same line with space
        }
        System.out.println(); // New line after printing the array
    }
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void reverse(int[]arr,int i,int j){
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }

    static void rotateInPlace(int[]arr,int k){
        int n =arr.length;
        k=k%n;

        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array:");
        int n=sc.nextInt();
        int[]arr = new int[n];
        n=arr.length;
        System.out.println("Enter " + n +" Elements");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter K:");
        int k =sc.nextInt();
        System.out.println("Array before Rotation");
        print_Array(arr);

        rotateInPlace(arr,k);

        System.out.println("Array After Rotation");
        print_Array(arr);

    }
}
