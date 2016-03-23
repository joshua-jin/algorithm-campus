class Solution {
public:
    /**
     * @param nums: a vector of integers
     * @return: nothing
     */
    void partitionArray(vector<int> &nums) {
        int oddIndex = 0;
        int evenIndex = nums.size() - 1;
        while (oddIndex < evenIndex) {
            if (nums[oddIndex] % 2 == 0) {
                int temp = nums[oddIndex];
                nums[oddIndex] = nums[evenIndex];
                nums[evenIndex] = temp;
                evenIndex--;
            } else {
                oddIndex++;
            }
        }
    }
};
