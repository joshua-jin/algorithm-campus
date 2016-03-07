class Solution {
public:
    /**
     * @param A and B: sorted integer array A and B.
     * @return: A new sorted integer array
     */
    vector<int> mergeSortedArray(vector<int> &A, vector<int> &B) {
        // write your code here
        vector<int> out;
        auto Ait = A.begin();
        auto Bit = B.begin();
        while (Ait != A.end() && Bit != B.end()) {
            if (*Ait > *Bit) {
                out.push_back(*Bit++);
            } else {
                out.push_back(*Ait++);
            }
        }
        while (Ait != A.end()) {
            out.push_back(*Ait++);
        }
        while (Bit != B.end()) {
            out.push_back(*Bit++);
        }
        return out;
    }
};
