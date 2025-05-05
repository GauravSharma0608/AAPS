public class Kth_Missing_Positive_Number_in_a_Sorted_Array {
    public int kthMissing(int[] arr, int k) {
        int n =arr.length;
        int left = 0, right = n-1;

        while(left <= right){
            int mid = left + (right - left) /2;
            int missing = arr[mid] - (mid+1);

            if(missing < k){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return k + left; // code here

    }
    public static void main(String[] args) {
        Kth_Missing_Positive_Number_in_a_Sorted_Array obj = new Kth_Missing_Positive_Number_in_a_Sorted_Array();

        int[] arr = {2, 3, 4, 7, 11};
        int k = 5;

        int result = obj.kthMissing(arr, k);
        System.out.println("The " + k + "th missing positive number is: " + result);
    }
}
