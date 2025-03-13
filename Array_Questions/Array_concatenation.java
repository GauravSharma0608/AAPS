import java.util.Arrays;
import java.util.Scanner;

public class Array_concatenation {
    public static int [] concatenate_array(int [] arr){
        int n = arr.length;
        int [] nums = new int[2*n];
        for (int i =0; i<n; i++){
            nums[i] = arr[i];
            nums[i+n] = arr[i];
        }
        return nums;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int n= sc.nextInt();

        int[] arr= new int[n];
        System.out.println("Enter " +n+ " Elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(concatenate_array(arr)));
    }
}
