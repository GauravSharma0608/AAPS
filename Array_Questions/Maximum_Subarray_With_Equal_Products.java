public class Maximum_Subarray_With_Equal_Products {
    public int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public long lcm(long a, long b) {
        return (a / gcd((int)a, (int)b)) * b;
    }

    public int maxLength(int[] nums) {
        int n = nums.length;
        int maxL = 1; // At least one element is a valid subarray

        for (int i = 0; i < n; i++) {
            long currPro = nums[i];
            long currGCD = nums[i];
            long currLCM = nums[i];

            if (currPro == currLCM * currGCD)
                maxL = Math.max(maxL, 1);

            for (int j = i + 1; j < n; j++) {
                currPro *= nums[j];
                currGCD = gcd((int)currGCD, nums[j]);
                currLCM = lcm(currLCM, nums[j]);

                if (currPro == currLCM * currGCD) {
                    maxL = Math.max(maxL, j - i + 1);
                } else if (currPro > 1e18) { // Break early if overflow is likely
                    break;
                }
            }
        }

        return maxL;
    }

    public static void main(String[] args) {
        Maximum_Subarray_With_Equal_Products obj = new Maximum_Subarray_With_Equal_Products();
        int[] nums = {2, 4, 8, 16};
        System.out.println("Max length: " + obj.maxLength(nums));
    }
}
