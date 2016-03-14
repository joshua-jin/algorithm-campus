class Solution {
public:
    /**
     * @param nums: a list of integers
     * @return: A integer denote the sum of minimum subarray
     */
    int minSubArray(vector<int> nums) {
        int min_sum = INT_MAX;
        int sum = INT_MAX;
        for (int i : nums) {
            if (sum == INT_MAX) sum = i;
            else sum = min(i, i+sum);
            
            if (sum < min_sum) {
                min_sum = sum;
            }
        }
        return min_sum;
    }
};
