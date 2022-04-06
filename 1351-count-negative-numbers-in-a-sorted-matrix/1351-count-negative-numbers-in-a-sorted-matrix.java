class Solution {
    public int countNegatives(int[][] grid) {
        
        int count = 0;
        int n = grid.length;
        int m = grid[0].length;
        
        for(int i = 0; i < n; i++) {
            int s = 0;
            int e = m - 1;
            while(s <= e) {
                int mid = (s + e) / 2;
                if(grid[i][mid] < 0) {
                    count += e - mid + 1;
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }
            }
        }
        return count;
    }
}