class Solution {
public:
    /**
     * @param A: An integer array.
     * @param B: An integer array.
     * @return: Cosine similarity.
     */
    double cosineSimilarity(vector<int> A, vector<int> B) {
        double Asum = 0, Bsum = 0, ABsum = 0;
        for (int i = 0; i < A.size(); i++) {
            double a = A[i], b = B[i];
            Asum += a*a;
            Bsum += b*b;
            ABsum += a*b;
        }
        double product = Asum * Bsum;
        return product == 0? 2 : ABsum / sqrt(product);
    }
};
