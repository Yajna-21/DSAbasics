class knightproblem {
public:
    void check(vector<vector<int>>& grid, int row, int col, int val, bool &a) {
        int n = grid.size();
        
        if (val == n * n - 1) {
            a = true;
            return;
        }
        int moves[8][2] = {{1,2},{2,1},{2,-1},{1,-2},{-1,2},{-2,1},{-2,-1},{-1,-2}};
        for (auto &m : moves) {
            int nr = row + m[0];
            int nc = col + m[1];
            if (nr >= 0 && nr < n && nc >= 0 && nc < n && grid[nr][nc] == val + 1) {
                check(grid, nr, nc, val + 1, a);
                return; 
            }
        }
        
        a = false; 
    }

    bool checkValidGrid(vector<vector<int>>& grid) {
        if (grid[0][0] != 0) return false; 
        bool a = false;
        check(grid, 0, 0, 0, a);
        return a;
    }
};