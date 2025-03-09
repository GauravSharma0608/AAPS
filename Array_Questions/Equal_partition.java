import java.util.Scanner;

public class Equal_partition {
    public static int FindArraySum(int[]arr){
        int total_Sum=0;
        for(int i=0; i<arr.length; i++){
            total_Sum += arr[i];
        }
        return total_Sum;
    }

    public static boolean Check_Equal_Partition(int[]arr){
        int total_Sum = FindArraySum(arr);
        int prefixSum =0;
        for(int i=0; i<arr.length; i++){
            prefixSum += arr[i];
            int suffixSum = total_Sum - prefixSum;
            if(prefixSum == suffixSum){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n = sc .nextInt();
        int [] arr= new int[n];
        System.out.println("Enter " + n + " Elements: " );
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }

        System.out.println("Equal partiton possible: " +Check_Equal_Partition(arr));

    }
}
