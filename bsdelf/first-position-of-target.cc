/**
 * @author      Yanhui Shen
 * @version     1.0
 * @since       2016-02-11 
 */

class Solution {
public:
    /**
     * @param nums: The integer array.
     * @param target: Target number to find.
     * @return: The first position of target. Position starts from 0. 
     */
    int binarySearch(vector<int> &array, int target) {
        size_t first = 0;
        int64_t count = array.size();
        while (count > 0) {
            size_t pos = first; 
            size_t step = count / 2; 
            pos += step;
            if (array[pos] < target) {
                first = ++pos;
                count -= step + 1; 
            } else {
                count = step;
            }
        }
        return array[first] == target ? first : -1; 
    }
};
