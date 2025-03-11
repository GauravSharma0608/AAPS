import java.util.Arrays;
import java.util.Scanner;

public class Split_Array {
    public static int split_array(int[] arr){
        int n = arr.length;
        int total_sum = Arrays.stream(arr).sum();

        int Left_sum  =0;
        for(int i=0; i<n; i++){
             Left_sum += arr[i];

             int Right_sum = total_sum - Left_sum;

             if(Left_sum == Right_sum){
                 return i;
             }
        }
        return -1;
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

        int splitIndex = split_array(arr);

        if (splitIndex != -1) {
            System.out.println("Split at index: " + splitIndex);
            System.out.println("Left Part: " + Arrays.toString(Arrays.copyOfRange(arr, 0, splitIndex + 1)));
            System.out.println("Right Part: " + Arrays.toString(Arrays.copyOfRange(arr, splitIndex + 1, arr.length)));
        } else {
            System.out.println("No valid split found.");
        }
    }
}
