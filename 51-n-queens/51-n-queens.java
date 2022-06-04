class Solution {

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        char[][] board = new char[n][n];
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<n; j++){
        //         board[i][j] = '.';
        //     }
        // }
        for (char[] b : board) {
            Arrays.fill(b, '.');
        }

        solveNQueensHelper(n, res, 0, board);
        return res;
    }

    private void solveNQueensHelper(int n, List<List<String>> res, int row, char[][] board) {
        if (row == n) {
            List<String> subAns = new ArrayList<>();
            for (char[] string : board) {
                // subAns.add(String.valueOf(string));
                subAns.add(new String(string));
            }
            res.add(subAns);
            return;
        }

        for (int i = 0; i < n; i++) {
            if (validatePosition(n, board, row, i)) {
                board[row][i] = 'Q';
                solveNQueensHelper(n, res, row + 1, board);
                board[row][i] = '.';
            }
        }
    }

    private boolean validatePosition(int n, char[][] board, int row, int col) {
        if (row == 0) {
            return true;
        }
        int originalRow = row;
        int originalCol = col;

        while (row >= 0) {
            if (board[row][col] == 'Q') {
                return false;
            }
            row--;
        }

        row = originalRow;
        while (row >= 0 && col >= 0) {
            if (board[row][col] == 'Q') {
                return false;
            }
            row--;
            col--;
        }

        row = originalRow;
        col = originalCol;
        while (row >= 0 && col < n) {
            if (board[row][col] == 'Q') {
                return false;
            }
            row--;
            col++;
        }

        return true;
    }
}
