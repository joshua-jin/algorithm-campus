class Solution {
public:
    /**
     * @param nums: The integer array.
     * @param target: Target number to find.
     * @return: The first position of target. Position starts from 0. 
     */
    int binarySearch(vector<int> &array, int target) {
        int start = 0;
        int end = array.size() - 1;
        while (start < end) {
            int i = (start + end) / 2;
            if (array[i] < target) {
                start = i + 1;
            } else {
                end = i;
            }
        }
        // write your code here
        return array[start] == target? start : -1;
    }
};
