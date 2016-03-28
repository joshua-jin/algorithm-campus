class Solution {
public:
    /**
     * @param A: a list of integers
     * @return : return an integer
     */
    int removeDuplicates(vector<int> &nums) {
        if (nums.empty()) return 0;
        int curIndex = 0;
        for (int i = 1; i < nums.size(); i++) {
            if (nums[i] != nums[curIndex]) {
                nums[++curIndex] = nums[i];
            }
        }
        
        return curIndex + 1;
    }
};
