class Solution {
public:
    /** 
     *@param A: A list of integers
     *@param elem: An integer
     *@return: The new length after remove
     */
    int removeElement(vector<int> &A, int elem) {
        int cur = 0;
        int end = A.size();
        
        while (cur < end) {
            if (A[cur] == elem) {
                A[cur] = A[end - 1];
                end--;
            } else {
                cur++;
            }
        }
        
        return cur;
    }
};
