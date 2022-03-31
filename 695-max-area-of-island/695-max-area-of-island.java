class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        
        int count = 0;
        int n = grid.length;
        int m = grid[0].length;
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                
                if(grid[i][j] == 1) {
                    count = Math.max(count, dfs(i, j, grid));
                }
            }
        }
        return count;
    }
    
    
    private int dfs(int i, int j, int[][] grid) {
        
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] < 1) {
            return 0;
        }
        
        grid[i][j] = 0;
        
        int up = dfs(i - 1, j, grid);
        int down = dfs(i + 1, j, grid);
        int left = dfs(i, j - 1, grid);
        int right = dfs(i, j + 1, grid);
        
        return 1 + up + down + left + right;
    }
}