import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs = new HashSet<>();
        for (int num : nums1) {
            hs.add(num);
        }

        HashSet<Integer> res = new HashSet<>();
        for (int num : nums2) {
            if (hs.contains(num)) {
                res.add(num);
            }
        }

        int[] arr = new int[res.size()];
        int ind = 0;
        for (int num : res) {
            arr[ind++] = num;
        }

        return arr;
    }

    public static void main(String[] args) {
        IntersectionOfTwoArrays obj = new IntersectionOfTwoArrays();
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] result = obj.intersection(nums1, nums2);
        System.out.println("Intersection: " + Arrays.toString(result));
    }
}
