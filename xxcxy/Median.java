package algorithm.lintcode.easy;

public class Median {
    public int median(int[] nums) {
        return index(nums, 0, nums.length - 1, (nums.length + 1) / 2 - 1);
    }

    public int index(int[] nums, int start, int end, int searchSeq) {
        int flag = nums[start];
        int startIndex = start;
        int endIndex = end;
        while (startIndex < endIndex) {
            if (flag > nums[startIndex + 1]) {
                swap(nums, startIndex, ++startIndex);
            } else {
                swap(nums, startIndex + 1, endIndex--);
            }
        }
        if (startIndex == searchSeq) {
            return flag;
        } else if (startIndex < searchSeq) {
            return index(nums, startIndex + 1, end, searchSeq);
        } else {
            return index(nums, start, startIndex - 1, searchSeq);
        }
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
