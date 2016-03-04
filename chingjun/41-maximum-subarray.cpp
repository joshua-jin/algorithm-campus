class Solution {
public:    
    /**
     * @param nums: A list of integers
     * @return: A integer indicate the sum of max subarray
     */
    int maxSubArray(vector<int> nums) {
        int max = nums.empty()? 0 : nums[0];
        int current = 0;
        for (auto &i : nums) {
            current = i > (current + i)? i : (current + i);
            if (current > max) {
                max = current;
            }
        }
        return max;
    }
};
