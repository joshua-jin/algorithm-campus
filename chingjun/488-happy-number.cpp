#include <set>

class Solution {
public:
    /**
     * @param n an integer
     * @return true if this is a happy number or false
     */
    bool isHappy(int n) {
        std::set<int> nums;
        while (true) {
            if (n == 1) {
                return true;
            } else if (nums.find(n) != nums.end()) {
                return false;
            } else {
                nums.insert(n);
                n = happynum(n);
            }
        }
        return false;
    }
    int happynum(int n) {
        int ret = 0;
        while (n > 0) {
            int rem = n % 10;
            ret += rem * rem;
            n = n / 10;
        }
        return ret;
    }
};
