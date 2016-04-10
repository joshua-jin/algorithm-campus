import java.util.Arrays;

public class Median {
    public int median(int[] nums) {
        Arrays.sort(nums);
        if (nums.length % 2 == 0) {
            return nums[nums.length / 2 - 1];
        }
        return nums[nums.length / 2];
    }
}
