class Solution {
public:
    /**
     * @param grid: a list of lists of integers.
     * @return: An integer, minimizes the sum of all numbers along its path
     */
    int minPathSum(vector<vector<int> > &grid) {
        int height = grid.size();
        int width = grid[0].size();
        
        int row1[width];
        int row2[width];
        int *prev_row = row1;
        int *cur_row = row2;
        
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                int cur = grid[i][j];
                if (i == 0) {
                    if (j == 0) cur_row[j] = cur;
                    else cur_row[j] = cur_row[j-1] + cur;
                } else if (j == 0) {
                    cur_row[j] = prev_row[j] + cur;
                } else {
                    cur_row[j] = min(cur_row[j-1], prev_row[j]) + cur;
                }
            }
            prev_row = cur_row;
        }
        
        return cur_row[width-1];
    }
};
