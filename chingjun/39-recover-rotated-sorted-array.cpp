class Solution {
public:
    void reverse(vector<int> &nums, int startIndex, int endIndex) {
        while (startIndex < endIndex) {
            int temp = nums[startIndex];
            nums[startIndex] = nums[endIndex];
            nums[endIndex] = temp;
            startIndex++;
            endIndex--;
        }
    }
    void recoverRotatedSortedArray(vector<int> &nums) {
        // write your code here
        int size = nums.size();
        for (int i = 1; i < size; i++) {
            if (nums[i] < nums[i-1]) {
                reverse(nums, 0, i-1);
                reverse(nums, i, size-1);
                reverse(nums, 0, size-1);
                return;
            }
        }
    }
};
