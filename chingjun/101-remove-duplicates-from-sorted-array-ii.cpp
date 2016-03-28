class Solution {
public:
    /**
     * @param A: a list of integers
     * @return : return an integer
     */
    int removeDuplicates(vector<int> &nums) {
        if (nums.empty()) return 0;
        int count = 1;
        int curIndex = 0;
        for (int i = 1; i < nums.size(); i++) {
            if (nums[i] == nums[curIndex]) {
                if (count < 2) {
                    nums[++curIndex] = nums[i];
                    count++;
                }
            } else {
                nums[++curIndex] = nums[i];
                count = 1;
            }
        }
        return curIndex + 1;
    }
};
