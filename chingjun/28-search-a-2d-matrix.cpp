class Solution {
public:
    /**
     * @param matrix, a list of lists of integers
     * @param target, an integer
     * @return a boolean, indicate whether matrix contains target
     */
    bool searchMatrix(vector<vector<int> > &matrix, int target) {
        if (matrix.empty()) return false;
        int height = matrix.size();
        int width = matrix[0].size();
        
        int size = height * width;
        int start = 0;
        int end = size;
        while (start < end) {
            int mid = start + (end - start) / 2;
            int row = mid / width;
            int column = mid % width;
            
            int val = matrix[row][column];
            if (val == target) return true;
            else if (val < target) start = mid + 1;
            else end = mid;
        }
        return false;
    }
};
