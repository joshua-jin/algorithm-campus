class Solution {
public:
    /**
     * @param digits a number represented as an array of digits
     * @return the result
     */
    vector<int> plusOne(vector<int>& digits) {
        digits.back() += 1;
        for (int i = digits.size() - 1; i > 0; i--) {
            if (digits[i] >= 10) {
                digits[i] -= 10;
                digits[i-1] += 1;
            } else {
                break;
            }
        }
        
        if (digits[0] >= 10) {
            digits[0] = 1;
            fill(digits.begin() + 1, digits.end(), 0);
            digits.push_back(0);
        }
        
        return digits;
    }
};
