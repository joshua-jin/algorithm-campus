class Solution {
public:
    /**
     * @param num: an integer
     * @return: an integer, the number of ones in num
     */
    int countOnes(int num) {
        // write your code here
        num = ((num & 0xAAAAAAAA) >> 1) + (num & 0x55555555);
        num = ((num & 0xCCCCCCCC) >> 2) + (num & 0x33333333);
        num = ((num & 0xF0F0F0F0) >> 4) + (num & 0x0F0F0F0F);
        num = ((num & 0xFF00FF00) >> 8) + (num & 0x00FF00FF);
        num = ((num & 0xFFFF0000) >> 16) + (num & 0x0000FFFF);
        return num;
    }
};
