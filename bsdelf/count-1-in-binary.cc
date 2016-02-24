/**
 * @author      Yanhui Shen
 * @version     1.0
 * @since       2016-02-11 
 */

class Solution {
public:
    /**
     * @param num: an integer
     * @return: an integer, the number of ones in num
     */
    int countOnes(int num) {
        unsigned int unum = static_cast<unsigned int>(num);
        int count = 0;
        while (unum > 0) {
            count += unum & 1;
            unum >>= 1;
        }
        return count;
    }
};
