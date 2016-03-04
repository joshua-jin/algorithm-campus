package algorithm.lintcode.easy;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int max = nums[0], sum = 0;
        for (int num : nums) {
            if (sum < 0)
                sum = 0;
            sum += num;
            if (sum > max)
                max = sum;
        }
        return max > sum ? max : sum;
    }
}
