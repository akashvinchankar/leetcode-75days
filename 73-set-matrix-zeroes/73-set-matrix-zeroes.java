class Solution {

    public void setZeroes(int[][] matrix) {
        Boolean isRow = false;
        Boolean isCol = false;

        // Check for 1st row element is 0
        for (int j = 0; j < matrix[0].length; j++) {
            if (matrix[0][j] == 0) {
                isRow = true;
                break;
            }
        }

        // Check for 2nd row element is 0
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                isCol = true;
                break;
            }
        }

        // Setting the first row and column to 0 as an reference
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        // Setting rest of the matrix elements to 0 from the reference row and columns
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[0][j] == 0 || matrix[i][0] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Setting first row to zero if required
        if (isRow) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[0][j] = 0;
            }
        }

        // Setting first column to zero if required
        if (isCol) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
