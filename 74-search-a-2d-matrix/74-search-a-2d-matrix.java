class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = matrix.length;
        int c = matrix[0].length;
        
        for(int i = 0; i < r; i++) {
            if(target >= matrix[i][0] && target <= matrix[i][c - 1]) {
                int s = 0;
                int e = c - 1;
                
                while(s <= e) {
                    int mid = s + (e - s) / 2;
                    if(matrix[i][mid] == target) {
                        return true;
                    }
                    
                    if(matrix[i][mid] > target) {
                        e = mid - 1;
                    } else {
                        s = mid + 1;
                    }
                }
            }
        }
        return false;
    }
}