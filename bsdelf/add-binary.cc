/**
 * @author      Yanhui Shen
 * @version     1.0
 * @since       2016-02-11 
 */

class Solution {
public:
    /**
     * @param a a number
     * @param b a number
     * @return the result
     */
    string addBinary(string& a, string& b) {
        const auto add_positive = [](const string& a, const string& b, const int num_sys) -> string {
            const auto char2num = [](char ch) -> int {
                return (int)ch - 48;
            };
            const auto num2char = [](int num) -> char {
                return (char)(num + 48);
            };
            string sum;
            int carry = 0;
            const int64_t max_size = std::max(a.size(), b.size());
            for (int64_t i = 1; i <= max_size; ++i) {
                const int64_t ia = (int64_t)a.size() - i;
                const int64_t ib = (int64_t)b.size() - i;
                int na = ia >= 0 ? char2num(a[ia]) : 0;
                int nb = ib >= 0 ? char2num(b[ib]) : 0;
                int partial = na + nb + carry;
                carry = partial / num_sys;
                partial = partial % num_sys;
                sum.insert(sum.begin(), num2char(partial));
            }
            if (carry > 0) {
                sum.insert(sum.begin(), num2char(carry));
            }
            return sum;
        };
        return add_positive(a, b, 2);
    }
};
