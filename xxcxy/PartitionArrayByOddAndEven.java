package algorithm.lintcode.easy;

public class PartitionArrayByOddAndEven {
    public void partitionArray(int[] nums) {
        int firstEvenIndex = 0;
        for (int i = 0, len = nums.length; i < len; i++) {
            if (nums[i] % 2 == 1) {
                if (i > firstEvenIndex) {
                    int tmp = nums[i];
                    nums[i] = nums[firstEvenIndex];
                    nums[firstEvenIndex] = tmp;
                }
                firstEvenIndex++;
            }
        }
    }
}
