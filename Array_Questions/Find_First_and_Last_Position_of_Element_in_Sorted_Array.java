public class Find_First_and_Last_Position_of_Element_in_Sorted_Array {
    public int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums, target);
        int last = findLast(nums, target);
        return new int[]{first, last};
    }

    private int findFirst(int[] nums, int target) {
        int l = 0, h = nums.length - 1, result = -1;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (nums[mid] == target) {
                result = mid;        // possible answer
                h = mid - 1;         // move to left side
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        return result;
    }

    private int findLast(int[] nums, int target) {
        int l = 0, h = nums.length - 1, result = -1;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (nums[mid] == target) {
                result = mid;       // possible answer
                l = mid + 1;        // move to right side
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Find_First_and_Last_Position_of_Element_in_Sorted_Array obj = new Find_First_and_Last_Position_of_Element_in_Sorted_Array();
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] result = obj.searchRange(nums, target);
        System.out.println("First and Last Position of " + target + ": [" + result[0] + ", " + result[1] + "]");
    }
}
