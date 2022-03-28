class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        List<Integer> result  = new ArrayList<>();
        
        if(n == 0) {
            return result;
        }
        
        int rS = 0;
        int rE = n - 1;
        
        int cS = 0;
        int cE = matrix[0].length - 1;
        
        while(rS <= rE && cS <= cE) {
            
            // right
            for(int i = cS; i <= cE; i++) {
                result.add(matrix[rS][i]);
            }
            rS++;
            
            
            //down
            for(int i = rS; i <= rE; i++) {
                result.add(matrix[i][cE]);
            }
            cE--;
            
            
            //left
            if(rS <= rE) {
                for(int i = cE; i >= cS; i--) {
                    result.add(matrix[rE][i]);
                }
                rE--;
            }
            
            //right
            if(cS <= cE) {
                for(int i = rE; i >= rS; i--) {
                result.add(matrix[i][cS]);
                }
                cS++;
            }
        }
        
        return result;
    }
}