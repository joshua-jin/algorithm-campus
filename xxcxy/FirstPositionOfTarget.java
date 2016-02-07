package algorithm.lintcode.easy;

public class FirstPositionOfTarget {
    public int binarySearch(int[] nums, int target) {
        //write your code here
        return binarySearch(nums, 0, nums.length, target);
    }

    private int binarySearch(int[] nums, int start, int end, int target) {
        if(end - start < 2) {
            return nums[start] == target ? start :
                    nums[end] == target ? end : -1;
        }
        int mid = (start + end) /2;
        if(target > nums[mid]) {
            start = mid;
        }else {
            end = mid;
        }
        return binarySearch(nums, start, end, target);
    }
}
