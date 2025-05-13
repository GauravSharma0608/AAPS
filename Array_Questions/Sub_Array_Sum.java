public class Sub_Array_Sum {
    public static int sub_array_sum(int[]arr,int k){
        int n =arr.length;
        int count =0;

        for(int i =0; i<n; i++){
            int sum = 0;
            for(int j = i; j<n; j++){
                sum += arr[j];
                if(sum == k){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1};
        int k = 3;
        System.out.println("Subarrays with sum " + k + ": " + sub_array_sum(arr, k));
    }
}
