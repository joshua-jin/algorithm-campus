class Solution {
public:
    /**
     * @param A an array of Integer
     * @return  an integer
     */
    int longestIncreasingContinuousSubsequence(vector<int>& A) {
        int start_incr = 0;
        int start_decr = 0;
        int longest = 0;
        for (int i = 1, len = A.size(); i < len; i++) {
            if (A[i] <= A[i-1]) {
                int cur_length = i - start_incr;
                if (cur_length > longest) longest = cur_length;
                start_incr = i;
            }
            if (A[i] >= A[i-1]) {
                int cur_length = i - start_decr;
                if (cur_length > longest) longest = cur_length;
                start_decr = i;
            }
        }
        if (A.size() - start_incr > longest) longest = A.size() - start_incr;
        if (A.size() - start_decr > longest) longest = A.size() - start_decr;
        return longest;
    }
};
