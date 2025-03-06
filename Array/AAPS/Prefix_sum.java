import java.util.Scanner;

public class Prefix_sum {

     public static void print_Array(int[]arr){
         int n= arr.length;
         for (int i=0; i<n; i++){
             System.out.print(arr[i]+ " ");

         }
         System.out.println();
     }

     static int[] Make_Prefix_Sum(int []arr){
         int n= arr.length;
//         int [] prefix = new int[n];
//         prefix[0] = arr[0];
         for(int i =1; i<n; i++){
             arr[i]= arr[i-1] + arr[i];
         }
         return arr;
     }
    static int[] Make_Suffix_Sum(int[] arr) {
        int n = arr.length;

        // Start from the second to last element and add it to the next one
        for (int i = n - 2; i >= 0; i--) {
            arr[i] = arr[i] + arr[i + 1];
        }

        return arr;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter " + n + " Elements: ");
        for (int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }

        System.out.println("Original Array: ");
        print_Array(arr);

        System.out.println("Prefix Sum / Running Sum :");
        int [] prefix = Make_Prefix_Sum(arr);
        print_Array(prefix);

        System.out.println("Suffix Sum: ");
        int [] Suffix = Make_Suffix_Sum(arr);
        print_Array(Suffix);
    }
}
