/**
 * @author      Yanhui Shen
 * @version     1.0
 * @since       2016-02-11 
 */

class Solution {
public:
    /**
     * @param A: An integer array.
     * @param B: An integer array.
     * @return: Cosine similarity.
     */
    double cosineSimilarity(vector<int> A, vector<int> B) {
        if (A.empty() || A.size() != B.size() ||
            all_of(A.begin(), A.end(), [](int i) { return i == 0; }))
            return 2.f;

        double ab = 0.f, aa = 0.f, bb = 0.f;
        for (size_t i = 0; i < A.size(); ++i) {
            ab += A[i] * B[i];
            aa += A[i] * A[i];
            bb += B[i] * B[i];
        }
        return ab / sqrt(aa) / sqrt(bb);
    }
};
