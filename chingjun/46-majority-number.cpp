class Solution {
public:
    /**
     * @param nums: A list of integers
     * @return: The majority number
     */
    int majorityNumber(vector<int> nums) {
        return kth_element(nums, nums.size() / 2, 0, nums.size() - 1);
    }
    
    int kth_element(vector<int> &nums, int k, int start_index, int end_index) {
        if (start_index >= end_index) {
            return nums[start_index];
        }
        int pivot = nums[start_index];
        int scan_end = end_index;
        int i = start_index + 1;
        while (i <= scan_end) {
            if (nums[i] > pivot) {
                int temp = nums[i];
                nums[i] = nums[scan_end];
                nums[scan_end] = temp;
                scan_end--;
            } else {
                nums[i-1] = nums[i];
                i++;
            }
        }
        i--;
        nums[i] = pivot;

        if (i == k) {
            return nums[i];
        } else if (i <= k) {
            return kth_element(nums, k, i+1, end_index);
        } else {
            return kth_element(nums, k, start_index, i-1);
        }
    }
};
