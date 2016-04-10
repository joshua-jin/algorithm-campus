package algorithm.lintcode.easy;

public class RemoveDuplicatesFromSortedArrayII {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int prevNum = nums[0];
        int insertIndex = 1;
        int repeatTimes = 0;
        int maxRepeatTimes = 1;
        for (int i = 1, len = nums.length; i < len; i++) {
            if (nums[i] != prevNum) {
                nums[insertIndex++] = nums[i];
                prevNum = nums[i];
                repeatTimes = 0;
            } else if (repeatTimes < maxRepeatTimes) {
                nums[insertIndex++] = nums[i];
                repeatTimes++;
            }
        }
        return insertIndex;
    }
}
