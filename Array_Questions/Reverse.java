import java.util.Arrays;
import java.util.Scanner;
public class Reverse {
    //Approach 1. Inplace Reverse
    public static void Swap_in_Array(int[]arr , int i,int j){
            int temp=arr[i];
           arr[i] = arr[j];
           arr[j] = temp;

        }
    public static void Reverse_Array( int[] arr) {
        int i =0; int j= arr.length -1;
        while(i<j){
            Swap_in_Array(arr,i,j);
            i++;
            j--;
    }

    }


//    public static int[]  Reverse_Array(int[]arr){
//        int n = arr.length;
//        int[] rev = new int[n];
//        int j=0;
//        for(int i=n-1; i>=0;i--){
//            rev[j++]= arr[i];
//        }
//        return rev;
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int n= sc.nextInt();

        int[] arr= new int[n];
        System.out.println("Enter " +n+ " Elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
//        int[] reverse = Reverse_Array(arr);
//        System.out.println("Reversed Array :" + Arrays.toString(reverse));

         Reverse_Array(arr);
        System.out.println("Reversed Array :" +Arrays.toString(arr));
    }
}
