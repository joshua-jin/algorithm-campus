package algorithm.lintcode.easy;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int insertIndex = 1;
        int prevNum = nums[0];
        for (int i = 1, len = nums.length; i < len; i++) {
            if (nums[i] != prevNum) {
                nums[insertIndex++] = nums[i];
                prevNum = nums[i];
            }
        }
        return insertIndex;
    }
}
