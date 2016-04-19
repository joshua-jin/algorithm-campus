class Solution {
    /** 
     * param A : an integer sorted array
     * param target :  an integer to be inserted
     * return : an integer
     */
public:
    int searchInsert(vector<int> &A, int target) {
        return searchInsert(A, 0, A.size(), target);
    }
    
    int searchInsert(vector<int> &A, int start, int end, int target) {
        if (start >= end) return start;
        int mid = start + (end - start) / 2;
        if (A[mid] == target) {
            return mid;
        } else if (A[mid] > target) {
            return searchInsert(A, start, mid, target);
        } else {
            return searchInsert(A, mid+1, end, target);
        }
    }
};
