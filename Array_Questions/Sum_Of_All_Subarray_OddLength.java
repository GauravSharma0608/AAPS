import java.util.Scanner;

public class Sum_Of_All_Subarray_OddLength {
    public static int sub_array_Odd_length(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum += (arr[i] * ((((i + 1) * (arr.length - i)) + 1) / 2));
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size Of Array: ");
        int n = sc .nextInt();

        System.out.println("Enter  " + n + " Elements : ");
        int [] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] =sc.nextInt();
        }

        System.out.println(sub_array_Odd_length(arr));
    }
}
