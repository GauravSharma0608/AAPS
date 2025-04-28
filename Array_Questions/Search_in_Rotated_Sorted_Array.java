public class Search_in_Rotated_Sorted_Array {
    public int search(int[] nums, int x) {
        int l=0,h=nums.length-1;
        while (l <= h) {
            int m = l + (h - l) / 2; // Correct mid-point calculation

            // If the element is found
            if (nums[m] == x) {
                return m;
            }

            // Check if the left half is sorted
            if (nums[l] <= nums[m]) {
                // If x is in the range of the left half
                if (nums[l] <= x && x < nums[m]) {
                    h = m - 1;
                } else {
                    l = m + 1;
                }
            }
            // Right half is sorted
            else {

                if (nums[m] < x && x <= nums[h]) {
                    l = m + 1;
                } else {
                    h = m - 1;
                }
            }
        }


        return -1;
    }
    public static void main(String[] args) {
        Search_in_Rotated_Sorted_Array obj = new Search_in_Rotated_Sorted_Array();
        int[] nums = {4,5,6,7,0,1,2};
        int x = 0;
        int index = obj.search(nums, x);
        System.out.println("Element found at index: " + index);
    }
}
