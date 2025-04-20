public class Target_Sum {
    public int findTargetSumWays(int[] nums, int target) {
        return cal(nums, target, 0, 0);
    }

    public int cal(int[] nums, int tar, int idx, int currSum) {
        if (idx == nums.length) {
            return (currSum == tar) ? 1 : 0;
        }

        int add = cal(nums, tar, idx + 1, currSum + nums[idx]);
        int sub = cal(nums, tar, idx + 1, currSum - nums[idx]);

        return add + sub;
    }
    public static void main(String[] args) {
        Target_Sum ts = new Target_Sum();
        int[] nums = {1, 1, 1, 1, 1};
        int target = 3;

        int result = ts.findTargetSumWays(nums, target);
        System.out.println("Number of ways: " + result);
    }
}
