public class FirstPositionOfTarget {
    public int binarySearch(int[] nums, int target) {
        int result = helper(nums, 0, nums.length, target);
        return anotherHelper(nums, result);
    }

    private Integer anotherHelper(int[] nums, int result) {
        if (result <= 0) {
            return result;
        }
        if (nums[result - 1] == nums[result]) {
            result--;
            return anotherHelper(nums, result);
        }
        return result;
    }

    private Integer helper(int[] arr, int start, int end, int target) {
        if (start > end)
            return -1;

        int mid = start + (end - start) / 2; //直接平均可能會溢位，所以用此算法
        if (arr[mid] > target)
            return helper(arr, start, mid - 1, target);
        if (arr[mid] < target)
            return helper(arr, mid + 1, end, target);
        return mid;
    }
}
