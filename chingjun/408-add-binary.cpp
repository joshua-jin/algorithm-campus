class Solution {
public:
    /**
     * @param a a number
     * @param b a number
     * @return the result
     */
    string addBinary(string& a, string& b) {
        string out;
        int carry = 0;
        for (int i = a.size() - 1, j = b.size() - 1; i >= 0 || j >= 0; i--, j--) {
            int ai = i >= 0? (a[i] == '1') : 0;
            int bi = j >= 0? (b[j] == '1') : 0;
            int num = ai + bi + carry;
            carry = 0;
            if (num >= 2) {
                num -= 2;
                carry = 1;
            }
            out += num? "1" : "0";
        }
        if (carry) {
            out += "1";
        }
        reverse(out.begin(), out.end());
        return out;
    }
};
