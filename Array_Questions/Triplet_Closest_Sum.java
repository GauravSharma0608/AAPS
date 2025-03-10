import java.util.Arrays;
import java.util.Scanner;

public class Triplet_Closest_Sum {

    public static int closet_sum(int [] arr, int target){
        Arrays.sort(arr);
        int min_Difference = Integer.MAX_VALUE;
        int Closet_sum = Integer.MAX_VALUE;

        for (int i=0; i<arr.length-2; i++){
            int left = i+1; int right = arr.length-1;

            while(left < right){

                int sum = arr[i] + arr[left] + arr[right];
                int diff = Math.abs(target - sum);

                if(diff<min_Difference){
                    min_Difference = diff;
                    Closet_sum = sum;
                }

                if(sum<target){
                    left++;
                }
                else{
                    right--;
                }

            }
        }
        return Closet_sum;
    }
    public static void main(String[] args) { Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int n= sc.nextInt();

        int[] arr= new int[n];
        System.out.println("Enter " +n+ " Elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the Target : ");
         int target = sc.nextInt();

        System.out.println("The closet Sum is : " +closet_sum( arr,target));
    }
}
