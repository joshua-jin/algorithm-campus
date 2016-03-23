class Solution {
public:
    /**
     * @param A an integer array
     * @return a long integer
     */
    long long permutationIndex(vector<int>& A) {
        return permutationIndex(A, 0);
    }
    
    long long permutationIndex(vector<int>& A, int index) {
        if (index == A.size() - 1) {
            return 1;
        }
        int count = 0;
        for (int i = index + 1; i < A.size(); i++) {
            if (A[i] < A[index]) count++;
        }
        long long k = A.size() - index - 1;
        long long fact = 1;
        for (int i = 2; i <= k; i++) {
            fact *= i;
        }
        return count * fact + permutationIndex(A, index + 1);
    }
};
