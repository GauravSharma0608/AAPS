import java.util.Scanner;

public class Maximum_Average_Subarray_I {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<k;i++)sum+=nums[i];
        int max=sum;
        int start=0;
        int end=k;
        while(end<nums.length){
            sum-=nums[start];
            start++;
            sum+=nums[end];
            end++;
            max=Math.max(max,sum);
        }
        return (double)max/k;
    }
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array:");
        int n = sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter " +n+ " Elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter  k :");
        int k = sc.nextInt();
    }
}
