public class Maximum_Subarray {
    public  static int maximum_subarray(int []arr){
        int n =arr.length;
        int [] dp = new int[n];
        dp[0] = arr[0];
        int Max_sum = arr[0];
        for(int i =1; i<arr.length; i++){
            dp[i] = Math.max(arr[i],dp[i-1] + arr[i]);
            Max_sum = Math.max(Max_sum,dp[i]);

        }
        return Max_sum;
    }
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Maximum Subarray Sum: " + maximum_subarray(arr));
    }
}
