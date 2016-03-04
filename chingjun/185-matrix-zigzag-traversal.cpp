class Solution {
public:
    /**
     * @param matrix: a matrix of integers
     * @return: a vector of integers
     */
    vector<int> printZMatrix(vector<vector<int> > &matrix) {
        int x_size = matrix.size();
        int y_size = matrix.empty()? 0 : matrix[0].size();
        int x = 0, y = 0;
        vector<int> out;
        while (true) {
            if (x >= 0 && x < x_size && y >= 0 && y < y_size)
                out.push_back(matrix[x][y]);
            if (x == x_size - 1 && y == y_size - 1) break;
            
            bool up = (x + y) % 2 == 0;
            int dx = up? -1 : 1;
            int dy = up? 1 : -1;
            
            if (up && x == 0) {
                y = y + 1;
            } else if (up && y == y_size - 1) {
                x = x + 1;
            } else if (!up && x == x_size - 1) {
                y = y + 1;
            } else if (!up && y == 0) {
                x = x + 1;
            } else {
                x += dx;
                y += dy;
            }
        }
        return out;
    }
};
