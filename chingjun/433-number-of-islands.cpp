class Solution {
public:
    /**
     * @param grid a boolean 2D matrix
     * @return an integer
     */
    int numIslands(vector<vector<bool>>& grid) {
        if (grid.empty() || grid[0].empty()) return 0;
        int row = grid.size();
        int column = grid[0].size();
        
        vector<int> islands;
        
        int curIslandId = 0;
        vector<vector<int>> islandId;
        
        for (int i = 0; i < row; i++) {
            islandId.push_back(vector<int>());
            for (int j = 0; j < column; j++) {
                islandId[i].push_back(-1);
                if (grid[i][j]) {
                    int topIslandId = i == 0? -1 : islandId[i-1][j];
                    int leftIslandId = j == 0? -1 : islandId[i][j-1];
                    
                    int curId;
                    if (topIslandId < 0 && leftIslandId < 0) {
                        // new island
                        islands.push_back(curIslandId);
                        curId = curIslandId;
                        curIslandId++;
                    } else if (topIslandId < 0) {
                        curId = leftIslandId;
                    } else if (leftIslandId < 0) {
                        curId = topIslandId;
                    } else {
                        if (topIslandId != leftIslandId) {
                            int bigger = max(topIslandId, leftIslandId);
                            int smaller = min(topIslandId, leftIslandId);
                            while (true) {
                                int curBiggerContent = islands[bigger];
                                islands[bigger] = islands[smaller];
                                if (curBiggerContent == bigger) break;
                                bigger = curBiggerContent;
                            }
                        } else {
                            curId = topIslandId;
                        }
                    }
                    
                    islandId[i][j] = curId;
                }
            }
        }
        
        int count = 0;
        for (int i = 0; i < islands.size(); i++) {
            if (i == islands[i]) count++;
        }
        
        return count;
    }
};
