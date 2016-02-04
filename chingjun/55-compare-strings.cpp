class Solution {
public:
    /**
     * @param A: A string includes Upper Case letters
     * @param B: A string includes Upper Case letter
     * @return:  if string A contains all of the characters in B return true 
     *           else return false
     */
    bool compareStrings(string A, string B) {
        int alen = A.length(), blen = B.length();
        if (blen > alen) {
            return false;
        }
        
        std::sort(A.begin(), A.end());
        std::sort(B.begin(), B.end());
        
        int a = 0;
        for (int b = 0; b < blen; b++) {
            bool match = false;
            while (a < alen) {
                if (A[a++] == B[b]) {
                    match = true;
                    break;
                }
            }
            if (!match && a >= alen) {
                return false;
            }
        }
        return true;
    }
};
