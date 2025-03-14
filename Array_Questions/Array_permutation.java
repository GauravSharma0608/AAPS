import java.util.Arrays;
import java.util.Scanner;

public class Array_permutation {
    public static int[] build_array(int [] arr){
        int n = arr.length;
        int [] res = new int [n];
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0 || arr[i] >= n) {
                throw new IllegalArgumentException("Invalid input: Elements must be in range [0, " + (n - 1) + "]");
            }
            res[i] = arr[arr[i]];
        }
        return res;

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

        System.out.println(Arrays.toString(build_array(arr)));
    }
}
