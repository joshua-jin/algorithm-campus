/**
 * @author      Yanhui Shen
 * @version     1.0
 * @since       2016-02-11 
 */

class Solution {
public:
    /**
     * @param A: A string includes Upper Case letters
     * @param B: A string includes Upper Case letter
     * @return:  if string A contains all of the characters in B return true 
     *           else return false
     */
    bool compareStrings(string A, string B) {
        const auto stat = [](const string& str, int* hist) {
            for (size_t i = 0; i < str.size(); ++i) {
                ++hist[str[i]-65];
            }
        };

        const int sz = 26;
        int hista[sz] = { 0 };
        stat(A, hista);
        int histb[sz] = { 0 };
        stat(B, histb);

        bool eq = true;
        for (size_t i = 0; i < B.size(); ++i) {
            int ich = B[i] - 65;
            if (hista[ich] < histb[ich]) {
                eq = false;
                break;
            }
        }
        return eq;
    }
};
